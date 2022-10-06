## Workflow
---

## Building for Android

1. Once you are finished modifying the code, click File>Build Settings... 

2. Make sure Platform is Android then click Player Settings... on the bottom left.

3. Click Publishing Settings and enter the password for the Project Keystore (Path: user.Keystore) and Project Key (Alias: key1).

4. Click Other Settings and under Identification update the Version and increment the Bundle Version Code. Users will have trouble installing the APK if the Bundle Version Code is not increased.

5. You can now close Project Settings.

6. On the Build Settings window make sure to un-check the Development Build check box if this is a production build.

7. Click Build or click Build And Run if you wish to build to a connected Android device.

<img width="461" alt="image" src="https://user-images.githubusercontent.com/2661933/144442092-62457451-3bf5-4c0d-a8cf-6da403c33783.png">


## Manually Deploying Update

1. Rename apks appropriately:

	RealWear Procedures (Unity): uar-release-rwproc.apk
	
	RealWear Sesssions (Unity): uar-release-rwsess.apk
	
2. Navigate to Azure Blob storage conatiner updates in the uarprdstorage account
    -https://portal.azure.com/#blade/Microsoft_Azure_Storage/ContainerMenuBlade/overview/storageAccountId/%2Fsubscriptions%2Fb31fbd72-481e-475c-98a2-c49f5250b883%2FresourceGroups%2Fuar-prd-rg%2Fproviders%2FMicrosoft.Storage%2FstorageAccounts%2Fuarprdstorage/path/updates/etag/%220x8D9A503A9301D1D%22/defaultEncryptionScope/%24account-encryption-key/denyEncryptionScopeOverride//defaultId//publicAccessVal/Blob

2. Click 'Upload' button

3. Upload new apk
