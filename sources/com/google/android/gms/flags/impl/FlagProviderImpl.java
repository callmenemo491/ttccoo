package com.google.android.gms.flags.impl;

@com.google.android.gms.common.util.DynamiteApi
/* loaded from: classes.dex */
public class FlagProviderImpl extends p449z6.AbstractBinderC7253b {

    /* renamed from: a */
    public boolean f5649a;

    /* renamed from: b */
    public android.content.SharedPreferences f5650b;

    public FlagProviderImpl() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f5649a = r0
            return
    }

    @Override // p449z6.InterfaceC7252a
    public boolean getBooleanFlagValue(java.lang.String r2, boolean r3, int r4) {
            r1 = this;
            boolean r4 = r1.f5649a
            if (r4 != 0) goto L5
            return r3
        L5:
            android.content.SharedPreferences r4 = r1.f5650b
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            a7.a r0 = new a7.a     // Catch: java.lang.Exception -> L18
            r0.<init>(r4, r2, r3)     // Catch: java.lang.Exception -> L18
            java.lang.Object r2 = p165j7.C3450c.m7911a(r0)     // Catch: java.lang.Exception -> L18
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Exception -> L18
            r3 = r2
            goto L38
        L18:
            r2 = move-exception
            java.lang.String r4 = "Flag value not available, returning default: "
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r0 = r2.length()
            if (r0 == 0) goto L2e
            java.lang.String r2 = r4.concat(r2)
            goto L33
        L2e:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L33:
            java.lang.String r4 = "FlagDataUtils"
            android.util.Log.w(r4, r2)
        L38:
            boolean r2 = r3.booleanValue()
            return r2
    }

    @Override // p449z6.InterfaceC7252a
    public int getIntFlagValue(java.lang.String r2, int r3, int r4) {
            r1 = this;
            boolean r4 = r1.f5649a
            if (r4 != 0) goto L5
            return r3
        L5:
            android.content.SharedPreferences r4 = r1.f5650b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            a7.a r0 = new a7.a     // Catch: java.lang.Exception -> L18
            r0.<init>(r4, r2, r3)     // Catch: java.lang.Exception -> L18
            java.lang.Object r2 = p165j7.C3450c.m7911a(r0)     // Catch: java.lang.Exception -> L18
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L18
            r3 = r2
            goto L38
        L18:
            r2 = move-exception
            java.lang.String r4 = "Flag value not available, returning default: "
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r0 = r2.length()
            if (r0 == 0) goto L2e
            java.lang.String r2 = r4.concat(r2)
            goto L33
        L2e:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L33:
            java.lang.String r4 = "FlagDataUtils"
            android.util.Log.w(r4, r2)
        L38:
            int r2 = r3.intValue()
            return r2
    }

    @Override // p449z6.InterfaceC7252a
    public long getLongFlagValue(java.lang.String r1, long r2, int r4) {
            r0 = this;
            boolean r4 = r0.f5649a
            if (r4 != 0) goto L5
            return r2
        L5:
            android.content.SharedPreferences r4 = r0.f5650b
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            a7.a r3 = new a7.a     // Catch: java.lang.Exception -> L18
            r3.<init>(r4, r1, r2)     // Catch: java.lang.Exception -> L18
            java.lang.Object r1 = p165j7.C3450c.m7911a(r3)     // Catch: java.lang.Exception -> L18
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Exception -> L18
            r2 = r1
            goto L38
        L18:
            r1 = move-exception
            java.lang.String r3 = "Flag value not available, returning default: "
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L2e
            java.lang.String r1 = r3.concat(r1)
            goto L33
        L2e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L33:
            java.lang.String r3 = "FlagDataUtils"
            android.util.Log.w(r3, r1)
        L38:
            long r1 = r2.longValue()
            return r1
    }

    @Override // p449z6.InterfaceC7252a
    public java.lang.String getStringFlagValue(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            boolean r4 = r1.f5649a
            if (r4 != 0) goto L5
            return r3
        L5:
            android.content.SharedPreferences r4 = r1.f5650b
            a7.a r0 = new a7.a     // Catch: java.lang.Exception -> L14
            r0.<init>(r4, r2, r3)     // Catch: java.lang.Exception -> L14
            java.lang.Object r2 = p165j7.C3450c.m7911a(r0)     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L14
            r3 = r2
            goto L34
        L14:
            r2 = move-exception
            java.lang.String r4 = "Flag value not available, returning default: "
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            int r0 = r2.length()
            if (r0 == 0) goto L2a
            java.lang.String r2 = r4.concat(r2)
            goto L2f
        L2a:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r4)
        L2f:
            java.lang.String r4 = "FlagDataUtils"
            android.util.Log.w(r4, r2)
        L34:
            return r3
    }

    @Override // p449z6.InterfaceC7252a
    public void init(p408x6.InterfaceC6957a r3) {
            r2 = this;
            java.lang.Object r3 = p408x6.BinderC6958b.m14124H(r3)
            android.content.Context r3 = (android.content.Context) r3
            boolean r0 = r2.f5649a
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = "com.google.android.gms"
            r1 = 0
            android.content.Context r3 = r3.createPackageContext(r0, r1)     // Catch: java.lang.Exception -> L1c android.content.pm.PackageManager.NameNotFoundException -> L3c
            android.content.SharedPreferences r3 = p008a7.C0028b.m34a(r3)     // Catch: java.lang.Exception -> L1c android.content.pm.PackageManager.NameNotFoundException -> L3c
            r2.f5650b = r3     // Catch: java.lang.Exception -> L1c android.content.pm.PackageManager.NameNotFoundException -> L3c
            r3 = 1
            r2.f5649a = r3     // Catch: java.lang.Exception -> L1c android.content.pm.PackageManager.NameNotFoundException -> L3c
            return
        L1c:
            r3 = move-exception
            java.lang.String r0 = "Could not retrieve sdk flags, continuing with defaults: "
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r1 = r3.length()
            if (r1 == 0) goto L32
            java.lang.String r3 = r0.concat(r3)
            goto L37
        L32:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0)
        L37:
            java.lang.String r0 = "FlagProviderImpl"
            android.util.Log.w(r0, r3)
        L3c:
            return
    }
}
