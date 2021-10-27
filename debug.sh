#!/bin/bash

# mydir="`dirname $BASH_SOURCE`"
# cfDir="${mydir}"/../checker-framework-inference
# . "${cfDir}"/scripts/runtime-env-setup.sh

export MYDIR=`dirname $0`
. ./$MYDIR/setup.sh

CHECKER=universe.GUTChecker

#SOLVER=universe.solver.GUTSolverEngine
IS_HACK=true

DEBUG_SOLVER=checkers.inference.solver.DebugSolver
SOLVER="$DEBUG_SOLVER"
#IS_HACK=false
#DEBUG_CLASSPATH=""

#GUTPATH=$ROOT/universe/build/classes/java/main
#export CLASSPATH=$GUTPATH:$DEBUG_CLASSPATH:.
#export external_checker_classpath=$GUTPATH

$CFI/scripts/inference-dev --checker "$CHECKER" --solver "$SOLVER" --solverArgs="collectStatistics=true" --hacks="$IS_HACK" -m ROUNDTRIP -afud ./annotated "$@"

# TYPE CHECKING
# $CFI/scripts/inference-dev --checker "$CHECKER" --solver "$SOLVER" --solverArgs="collectStatistics=true,solver=z3" --hacks="$IS_HACK" -m TYPECHECK "$@"