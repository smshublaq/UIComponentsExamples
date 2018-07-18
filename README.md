[![DOI](https://zenodo.org/badge/125386835.svg)](https://zenodo.org/badge/latestdoi/125386835)

# Ice and hot days in Vorarlberg 

This experiment aims to explore the connection between Ice and hot days in Vorarlberg 

## Prerequisites

Prior to running the experiment make sure that the following folders exist:

* `data/raw` - Folder to store the external datasets
* `data/processed` - Folder to store the intermediate dataset in
* `reports/figures` - Target folder for generated correlation plot

## Data Sources

* hot days in Vorarlberg: https://www.data.gv.at/katalog/dataset/fba931df-c5fb-499a-87cf-ab1793d546e6
* Ice days in Vorarlberg: https://www.data.gv.at/katalog/dataset/a8690895-97d4-490c-883e-ce01b9e8368d

The cited datasources have already been added to this repository. 

Follow these instructions if you want to use updated versions of these datasource:

1. Download CSV files to folder `data/raw`


## Running the code

To run the code in this repository you will need to have access to a machine running `python` (at least version `3.7`) and pip.

Run `pip install -r requirements.txt` to install the required dependencies.

Once the dependencies have been installed, start the python main.py command. 


