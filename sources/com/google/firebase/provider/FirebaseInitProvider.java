package com.google.firebase.provider;

/* loaded from: classes.dex */
public class FirebaseInitProvider extends android.content.ContentProvider {
    public FirebaseInitProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public void attachInfo(android.content.Context r3, android.content.pm.ProviderInfo r4) {
            r2 = this;
            java.lang.String r0 = "FirebaseInitProvider ProviderInfo cannot be null."
            com.google.android.gms.common.internal.C1101a.m3104i(r4, r0)
            java.lang.String r0 = r4.authority
            java.lang.String r1 = "com.google.firebase.firebaseinitprovider"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L13
            super.attachInfo(r3, r4)
            return
        L13:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle."
            r3.<init>(r4)
            throw r3
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            java.lang.Object r1 = p251o9.C5180d.f20309i
            monitor-enter(r1)
            java.util.Map<java.lang.String, o9.d> r2 = p251o9.C5180d.f20311k     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "[DEFAULT]"
            s.h r2 = (p319s.C5941h) r2     // Catch: java.lang.Throwable -> L45
            int r2 = r2.m12340e(r3)     // Catch: java.lang.Throwable -> L45
            r3 = 0
            if (r2 < 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            if (r2 == 0) goto L1f
            o9.d r0 = p251o9.C5180d.m11494c()     // Catch: java.lang.Throwable -> L45
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L36
        L1f:
            o9.h r2 = p251o9.C5184h.m11503a(r0)     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L2f
            java.lang.String r0 = "FirebaseApp"
            java.lang.String r2 = "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project."
            android.util.Log.w(r0, r2)     // Catch: java.lang.Throwable -> L45
            r0 = 0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            goto L36
        L2f:
            java.lang.String r4 = "[DEFAULT]"
            o9.d r0 = p251o9.C5180d.m11496g(r0, r2, r4)     // Catch: java.lang.Throwable -> L45
            goto L1d
        L36:
            if (r0 != 0) goto L3d
            java.lang.String r0 = "FirebaseInitProvider"
            java.lang.String r1 = "FirebaseApp initialization unsuccessful"
            goto L41
        L3d:
            java.lang.String r0 = "FirebaseInitProvider"
            java.lang.String r1 = "FirebaseApp initialization successful"
        L41:
            android.util.Log.i(r0, r1)
            return r3
        L45:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L45
            throw r0
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r1 = 0
            return r1
    }
}
