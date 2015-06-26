#!/bin/bash

siege -v -c 10 -t 25s "http://localhost:8080"

# you can find more options at https://www.joedog.org/siege-manual/
