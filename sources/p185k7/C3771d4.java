package p185k7;

/* renamed from: k7.d4 */
/* loaded from: classes.dex */
public final class C3771d4 implements p185k7.InterfaceC3743b4 {

    /* renamed from: c */
    public static p185k7.C3771d4 f16554c;

    /* renamed from: a */
    public final android.content.Context f16555a;

    /* renamed from: b */
    public final android.database.ContentObserver f16556b;

    public C3771d4() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f16555a = r0
            r1.f16556b = r0
            return
    }

    public C3771d4(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r3.f16555a = r4
            k7.c4 r0 = new k7.c4
            r0.<init>()
            r3.f16556b = r0
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.net.Uri r1 = p185k7.C3998u3.f16878a
            r2 = 1
            r4.registerContentObserver(r1, r2, r0)
            return
    }

    /* renamed from: a */
    public static p185k7.C3771d4 m8487a(android.content.Context r2) {
            java.lang.Class<k7.d4> r0 = p185k7.C3771d4.class
            monitor-enter(r0)
            k7.d4 r1 = p185k7.C3771d4.f16554c     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L1c
            java.lang.String r1 = "com.google.android.providers.gsf.permission.READ_GSERVICES"
            int r1 = p064e.C1494h.m4051b(r2, r1)     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L15
            k7.d4 r1 = new k7.d4     // Catch: java.lang.Throwable -> L20
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            goto L1a
        L15:
            k7.d4 r1 = new k7.d4     // Catch: java.lang.Throwable -> L20
            r1.<init>()     // Catch: java.lang.Throwable -> L20
        L1a:
            p185k7.C3771d4.f16554c = r1     // Catch: java.lang.Throwable -> L20
        L1c:
            k7.d4 r2 = p185k7.C3771d4.f16554c     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r2
    }

    /* renamed from: b */
    public final java.lang.String m8488b(java.lang.String r5) {
            r4 = this;
            android.content.Context r0 = r4.f16555a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.appcompat.widget.x r0 = new androidx.appcompat.widget.x     // Catch: java.lang.NullPointerException -> L12 java.lang.SecurityException -> L14 java.lang.IllegalStateException -> L16
            r0.<init>(r4, r5)     // Catch: java.lang.NullPointerException -> L12 java.lang.SecurityException -> L14 java.lang.IllegalStateException -> L16
            java.lang.Object r0 = p052d6.C1306f0.m3776e(r0)     // Catch: java.lang.NullPointerException -> L12 java.lang.SecurityException -> L14 java.lang.IllegalStateException -> L16
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.NullPointerException -> L12 java.lang.SecurityException -> L14 java.lang.IllegalStateException -> L16
            return r0
        L12:
            r0 = move-exception
            goto L17
        L14:
            r0 = move-exception
            goto L17
        L16:
            r0 = move-exception
        L17:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "Unable to read GServices for: "
            int r3 = r5.length()
            if (r3 == 0) goto L28
            java.lang.String r5 = r2.concat(r5)
            goto L2d
        L28:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r2)
        L2d:
            java.lang.String r2 = "GservicesLoader"
            android.util.Log.e(r2, r5, r0)
            return r1
    }

    @Override // p185k7.InterfaceC3743b4
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ java.lang.Object mo8224f(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = r0.m8488b(r1)
            return r1
    }
}
