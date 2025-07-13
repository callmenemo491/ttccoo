package p184k6;

/* renamed from: k6.f */
/* loaded from: classes.dex */
public class C3703f {

    /* renamed from: a */
    public static final int f16408a = 0;

    /* renamed from: b */
    public static final p184k6.C3703f f16409b = null;

    static {
            boolean r0 = p184k6.C3705h.f16411a
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            p184k6.C3703f.f16408a = r0
            k6.f r0 = new k6.f
            r0.<init>()
            p184k6.C3703f.f16409b = r0
            return
    }

    public C3703f() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RecentlyNullable
    /* renamed from: a */
    public android.content.Intent mo8163a(android.content.Context r4, int r5, java.lang.String r6) {
            r3 = this;
            r0 = 1
            java.lang.String r1 = "com.google.android.gms"
            if (r5 == r0) goto L20
            r0 = 2
            if (r5 == r0) goto L20
            r4 = 3
            r6 = 0
            if (r5 == r4) goto Ld
            return r6
        Ld:
            int r4 = p248o6.C4925o0.f19529a
            java.lang.String r4 = "package"
            android.net.Uri r4 = android.net.Uri.fromParts(r4, r1, r6)
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r5.<init>(r6)
            r5.setData(r4)
            return r5
        L20:
            if (r4 == 0) goto L37
            boolean r5 = p353u6.C6342e.m12992b(r4)
            if (r5 == 0) goto L37
            int r4 = p248o6.C4925o0.f19529a
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION"
            r4.<init>(r5)
            java.lang.String r5 = "com.google.android.wearable.app"
            r4.setPackage(r5)
            return r4
        L37:
            java.lang.String r5 = "gcore_"
            java.lang.StringBuilder r5 = android.support.v4.media.C0144c.m256a(r5)
            int r0 = p184k6.C3703f.f16408a
            r5.append(r0)
            java.lang.String r0 = "-"
            r5.append(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 != 0) goto L50
            r5.append(r6)
        L50:
            r5.append(r0)
            if (r4 == 0) goto L5c
            java.lang.String r6 = r4.getPackageName()
            r5.append(r6)
        L5c:
            r5.append(r0)
            if (r4 == 0) goto L75
            w6.b r6 = p388w6.C6816c.m13887a(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            java.lang.String r4 = r4.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            r0 = 0
            android.content.pm.PackageInfo r4 = r6.m13885b(r4, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            int r4 = r4.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            r5.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L74
            goto L75
        L74:
        L75:
            java.lang.String r4 = r5.toString()
            int r5 = p248o6.C4925o0.f19529a
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r5.<init>(r6)
            java.lang.String r6 = "market://details"
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.String r0 = "id"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "pcampaignid"
            r6.appendQueryParameter(r0, r4)
        L9d:
            android.net.Uri r4 = r6.build()
            r5.setData(r4)
            java.lang.String r4 = "com.android.vending"
            r5.setPackage(r4)
            r4 = 524288(0x80000, float:7.34684E-40)
            r5.addFlags(r4)
            return r5
    }

    /* renamed from: b */
    public int mo8164b(@androidx.annotation.RecentlyNonNull android.content.Context r11, int r12) {
            r10 = this;
            boolean r0 = p184k6.C3705h.f16411a
            android.content.res.Resources r0 = r11.getResources()     // Catch: java.lang.Throwable -> Ld
            r1 = 2131951731(0x7f130073, float:1.9539885E38)
            r0.getString(r1)     // Catch: java.lang.Throwable -> Ld
            goto L14
        Ld:
            java.lang.String r0 = "GooglePlayServicesUtil"
            java.lang.String r1 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r0, r1)
        L14:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r1 = r11.getPackageName()
            boolean r0 = r0.equals(r1)
            r1 = 1
            if (r0 != 0) goto L76
            java.util.concurrent.atomic.AtomicBoolean r0 = p184k6.C3705h.f16414d
            boolean r0 = r0.get()
            if (r0 != 0) goto L76
            java.lang.Object r0 = p248o6.C4945y0.f19552a
            monitor-enter(r0)
            boolean r2 = p248o6.C4945y0.f19553b     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L31
            goto L5c
        L31:
            p248o6.C4945y0.f19553b = r1     // Catch: java.lang.Throwable -> L73
            java.lang.String r2 = r11.getPackageName()     // Catch: java.lang.Throwable -> L73
            w6.b r3 = p388w6.C6816c.m13887a(r11)     // Catch: java.lang.Throwable -> L73
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r2 = r3.m13884a(r2, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54 java.lang.Throwable -> L73
            android.os.Bundle r2 = r2.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54 java.lang.Throwable -> L73
            if (r2 != 0) goto L46
            goto L5c
        L46:
            java.lang.String r3 = "com.google.app.id"
            r2.getString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54 java.lang.Throwable -> L73
            java.lang.String r3 = "com.google.android.gms.version"
            int r2 = r2.getInt(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54 java.lang.Throwable -> L73
            p248o6.C4945y0.f19554c = r2     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L54 java.lang.Throwable -> L73
            goto L5c
        L54:
            r2 = move-exception
            java.lang.String r3 = "MetadataValueReader"
            java.lang.String r4 = "This should never happen."
            android.util.Log.wtf(r3, r4, r2)     // Catch: java.lang.Throwable -> L73
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            int r0 = p248o6.C4945y0.f19554c
            if (r0 == 0) goto L6d
            r2 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r0 != r2) goto L67
            goto L76
        L67:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r11 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r11.<init>(r0)
            throw r11
        L6d:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r11 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r11.<init>()
            throw r11
        L73:
            r11 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L73
            throw r11
        L76:
            boolean r0 = p353u6.C6342e.m12992b(r11)
            r2 = 0
            if (r0 != 0) goto Lad
            java.lang.Boolean r0 = p353u6.C6342e.f24792c
            if (r0 != 0) goto La3
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            java.lang.String r3 = "android.hardware.type.iot"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 != 0) goto L9c
            android.content.pm.PackageManager r0 = r11.getPackageManager()
            java.lang.String r3 = "android.hardware.type.embedded"
            boolean r0 = r0.hasSystemFeature(r3)
            if (r0 == 0) goto L9a
            goto L9c
        L9a:
            r0 = 0
            goto L9d
        L9c:
            r0 = 1
        L9d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            p353u6.C6342e.f24792c = r0
        La3:
            java.lang.Boolean r0 = p353u6.C6342e.f24792c
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lad
            r0 = 1
            goto Lae
        Lad:
            r0 = 0
        Lae:
            java.lang.String r3 = "com.google.android.gms"
            if (r12 < 0) goto Lb4
            r4 = 1
            goto Lb5
        Lb4:
            r4 = 0
        Lb5:
            com.google.android.gms.common.internal.C1101a.m3096a(r4)
            java.lang.String r4 = r11.getPackageName()
            android.content.pm.PackageManager r5 = r11.getPackageManager()
            r6 = 0
            java.lang.String r7 = "GooglePlayServicesUtil"
            if (r0 == 0) goto Ld5
            java.lang.String r6 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r6 = r5.getPackageInfo(r6, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lce
            goto Ld5
        Lce:
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            goto L10c
        Ld5:
            r8 = 64
            android.content.pm.PackageInfo r8 = r5.getPackageInfo(r3, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L173
            p184k6.C3706i.m8168a(r11)
            boolean r9 = p184k6.C3706i.m8170d(r8, r1)
            if (r9 != 0) goto Leb
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
            goto L10c
        Leb:
            if (r0 == 0) goto L117
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            boolean r0 = p184k6.C3706i.m8170d(r6, r1)
            if (r0 == 0) goto L106
            android.content.pm.Signature[] r0 = r6.signatures
            r0 = r0[r2]
            android.content.pm.Signature[] r6 = r8.signatures
            r6 = r6[r2]
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L117
        L106:
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
        L10c:
            java.lang.String r12 = r12.concat(r0)
            android.util.Log.w(r7, r12)
            r12 = 9
            goto L181
        L117:
            int r0 = r8.versionCode
            r6 = -1
            if (r0 != r6) goto L11e
            r9 = -1
            goto L120
        L11e:
            int r9 = r0 / 1000
        L120:
            if (r12 != r6) goto L123
            goto L125
        L123:
            int r6 = r12 / 1000
        L125:
            if (r9 >= r6) goto L153
            r2 = 82
            int r2 = p064e.C1489c.m4038a(r4, r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Google Play services out of date for "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = ".  Requires "
            r3.append(r2)
            r3.append(r12)
            java.lang.String r12 = " but found "
            r3.append(r12)
            r3.append(r0)
            java.lang.String r12 = r3.toString()
            android.util.Log.w(r7, r12)
            r12 = 2
            goto L181
        L153:
            android.content.pm.ApplicationInfo r12 = r8.applicationInfo
            if (r12 != 0) goto L16b
            android.content.pm.ApplicationInfo r12 = r5.getApplicationInfo(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L15c
            goto L16b
        L15c:
            r12 = move-exception
            java.lang.String r0 = java.lang.String.valueOf(r4)
            java.lang.String r2 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r0.concat(r2)
            android.util.Log.wtf(r7, r0, r12)
            goto L180
        L16b:
            boolean r12 = r12.enabled
            if (r12 != 0) goto L171
            r12 = 3
            goto L181
        L171:
            r12 = 0
            goto L181
        L173:
            java.lang.String r12 = java.lang.String.valueOf(r4)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r12 = r12.concat(r0)
            android.util.Log.w(r7, r12)
        L180:
            r12 = 1
        L181:
            r0 = 18
            if (r12 != r0) goto L186
            goto L1bf
        L186:
            if (r12 != r1) goto L1be
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.PackageManager r2 = r11.getPackageManager()     // Catch: java.lang.Throwable -> L1be
            android.content.pm.PackageInstaller r2 = r2.getPackageInstaller()     // Catch: java.lang.Throwable -> L1be
            java.util.List r2 = r2.getAllSessions()     // Catch: java.lang.Throwable -> L1be
            java.util.Iterator r2 = r2.iterator()
        L19a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1b1
            java.lang.Object r3 = r2.next()
            android.content.pm.PackageInstaller$SessionInfo r3 = (android.content.pm.PackageInstaller.SessionInfo) r3
            java.lang.String r3 = r3.getAppPackageName()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L19a
            goto L1bf
        L1b1:
            android.content.pm.PackageManager r11 = r11.getPackageManager()
            r1 = 8192(0x2000, float:1.148E-41)
            android.content.pm.ApplicationInfo r11 = r11.getApplicationInfo(r0, r1)
            boolean r1 = r11.enabled
            goto L1bf
        L1be:
            r1 = 0
        L1bf:
            if (r1 == 0) goto L1c3
            r12 = 18
        L1c3:
            return r12
    }
}
