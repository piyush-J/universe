#!/bin/bash

echo Entering "$(cd "$(dirname "$0")" && pwd -P)/$(basename "$0")" in `pwd`

# Fail the whole script if any command fails
set -e

export SHELLOPTS

. ./.ci-build-without-test.sh

./scripts/check.sh tests/typecheck/topol/GBounds.java

./gradlew test
