#!/bin/bash

export MYDIR=`dirname $0`
. ./$MYDIR/setup.sh

CHECKER=universe.GUTChecker

SOLVER=universe.solver.GUTSolverEngine
IS_HACK=true

$CFI/scripts/inference-dev --checker "$CHECKER" --solver "$SOLVER" --solverArgs="collectStatistics=true" --hacks="$IS_HACK" -m ROUNDTRIP -afud ./annotated "$@"