package p030c0;

/* renamed from: c0.h */
/* loaded from: classes.dex */
public final class C0821h {
    /* renamed from: a */
    public static android.content.Intent m2471a(android.app.Activity r3) {
            android.content.Intent r0 = r3.getParentActivityIntent()
            if (r0 == 0) goto L7
            return r0
        L7:
            android.content.ComponentName r0 = r3.getComponentName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
            java.lang.String r0 = m2473c(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L49
            r1 = 0
            if (r0 != 0) goto L13
            return r1
        L13:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r3, r0)
            java.lang.String r3 = m2473c(r3, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            if (r3 != 0) goto L23
            android.content.Intent r3 = android.content.Intent.makeMainActivity(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            goto L2c
        L23:
            android.content.Intent r3 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
            android.content.Intent r3 = r3.setComponent(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d
        L2c:
            return r3
        L2d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r2 = "getParentActivityIntent: bad parentActivityName '"
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = "' in manifest"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "NavUtils"
            android.util.Log.e(r0, r3)
            return r1
        L49:
            r3 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: b */
    public static android.content.Intent m2472b(android.content.Context r2, android.content.ComponentName r3) {
            java.lang.String r0 = m2473c(r2, r3)
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            android.content.ComponentName r1 = new android.content.ComponentName
            java.lang.String r3 = r3.getPackageName()
            r1.<init>(r3, r0)
            java.lang.String r2 = m2473c(r2, r1)
            if (r2 != 0) goto L1c
            android.content.Intent r2 = android.content.Intent.makeMainActivity(r1)
            goto L25
        L1c:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            android.content.Intent r2 = r2.setComponent(r1)
        L25:
            return r2
    }

    /* renamed from: c */
    public static java.lang.String m2473c(android.content.Context r4, android.content.ComponentName r5) {
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 640(0x280, float:8.97E-43)
            r3 = 29
            if (r1 < r3) goto L10
            r2 = 269222528(0x100c0280, float:2.7612058E-29)
            goto L17
        L10:
            r3 = 24
            if (r1 < r3) goto L17
            r2 = 787072(0xc0280, float:1.102923E-39)
        L17:
            android.content.pm.ActivityInfo r5 = r0.getActivityInfo(r5, r2)
            java.lang.String r0 = r5.parentActivityName
            if (r0 == 0) goto L20
            return r0
        L20:
            android.os.Bundle r5 = r5.metaData
            r0 = 0
            if (r5 != 0) goto L26
            return r0
        L26:
            java.lang.String r1 = "android.support.PARENT_ACTIVITY"
            java.lang.String r5 = r5.getString(r1)
            if (r5 != 0) goto L2f
            return r0
        L2f:
            r0 = 0
            char r0 = r5.charAt(r0)
            r1 = 46
            if (r0 != r1) goto L4b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = r4.getPackageName()
            r0.append(r4)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
        L4b:
            return r5
    }
}
