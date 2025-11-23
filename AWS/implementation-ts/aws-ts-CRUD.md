# CRUD
2025-02-15
tags: [[💿 indexAWS]]

Base code:

```ts
import AWS from "aws-sdk";
import { AwsRegions } from "./types/aws";
const {DynamoDB} = AWS;

AWS.config.update({
  region: AwsRegions.SA_EAST_1
})

const DB = new DynamoDB();
```

## Create Table

``` ts
export const dynamodbCreateTable = async (params :AWS.DynamoDB.CreateTableInput) => {

  try {
    const result = await DB.createTable(params).promise();
    return result;

  } catch (error) {

    if(error instanceof Error) throw error;
    else throw new Error(`ERROR: dynamodbCreateTable have a unknown type of error: ` + error)

  }

}
```

```ts
import { dynamodbCreateTable } from "./aws";
import AWS from "aws-sdk"


const vendorTableParams :AWS.DynamoDB.CreateTableInput = {
  TableName: 'vendors',
  KeySchema: [
    {AttributeName: 'twitterId', KeyType: 'HASH'},
  ],

  AttributeDefinitions: [
    {AttributeName: 'twitterId', AttributeType: 'S'}
  ],

  ProvisionedThroughput: {
    ReadCapacityUnits: 10,
    WriteCapacityUnits: 10
  }

}

dynamodbCreateTable(vendorTableParams);
```

