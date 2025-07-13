package p090f6;

/* renamed from: f6.d */
/* loaded from: classes.dex */
public final class AsyncTaskC2069d extends android.os.AsyncTask<android.net.Uri, java.lang.Long, android.graphics.Bitmap> {

    /* renamed from: c */
    public static final p123h6.C2489b f9473c = null;

    /* renamed from: a */
    public final p090f6.InterfaceC2072g f9474a;

    /* renamed from: b */
    public final p090f6.C2067b f9475b;

    static {
            h6.b r0 = new h6.b
            java.lang.String r1 = "FetchBitmapTask"
            r0.<init>(r1)
            p090f6.AsyncTaskC2069d.f9473c = r0
            return
    }

    public AsyncTaskC2069d(android.content.Context r14, int r15, int r16, boolean r17, p090f6.C2067b r18) {
            r13 = this;
            r1 = r13
            r13.<init>()
            r0 = r18
            r1.f9475b = r0
            android.content.Context r0 = r14.getApplicationContext()
            f6.c r4 = new f6.c
            r4.<init>(r13)
            h6.b r2 = p072e7.C1726r3.f7765a
            android.content.Context r0 = r0.getApplicationContext()     // Catch: p052d6.C1337y -> L31 android.os.RemoteException -> L33
            e7.w6 r2 = p072e7.C1726r3.m4430a(r0)     // Catch: p052d6.C1337y -> L31 android.os.RemoteException -> L33
            x6.b r3 = new x6.b     // Catch: p052d6.C1337y -> L31 android.os.RemoteException -> L33
            r3.<init>(r13)     // Catch: p052d6.C1337y -> L31 android.os.RemoteException -> L33
            r7 = 0
            r8 = 2097152(0x200000, double:1.036131E-317)
            r10 = 5
            r11 = 333(0x14d, float:4.67E-43)
            r12 = 10000(0x2710, float:1.4013E-41)
            r5 = r15
            r6 = r16
            f6.g r0 = r2.mo4480c2(r3, r4, r5, r6, r7, r8, r10, r11, r12)     // Catch: p052d6.C1337y -> L31 android.os.RemoteException -> L33
            goto L4d
        L31:
            r0 = move-exception
            goto L34
        L33:
            r0 = move-exception
        L34:
            h6.b r2 = p072e7.C1726r3.f7765a
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r5 = "newFetchBitmapTaskImpl"
            r3[r4] = r5
            r4 = 1
            java.lang.Class<e7.w6> r5 = p072e7.InterfaceC1775w6.class
            java.lang.String r5 = r5.getSimpleName()
            r3[r4] = r5
            java.lang.String r4 = "Unable to call %s on %s."
            r2.m6377b(r0, r4, r3)
            r0 = 0
        L4d:
            r1.f9474a = r0
            return
    }

    /* renamed from: a */
    public static /* synthetic */ void m5492a(p090f6.AsyncTaskC2069d r0, java.lang.Object[] r1) {
            r0.publishProgress(r1)
            return
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ android.graphics.Bitmap doInBackground(android.net.Uri[] r7) {
            r6 = this;
            android.net.Uri[] r7 = (android.net.Uri[]) r7
            int r0 = r7.length
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L2e
            r0 = 0
            r7 = r7[r0]
            if (r7 != 0) goto Ld
            goto L2e
        Ld:
            f6.g r3 = r6.f9474a
            if (r3 != 0) goto L12
            goto L2e
        L12:
            android.graphics.Bitmap r2 = r3.mo5493v0(r7)     // Catch: android.os.RemoteException -> L17
            goto L2e
        L17:
            r7 = move-exception
            h6.b r3 = p090f6.AsyncTaskC2069d.f9473c
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "doFetch"
            r4[r0] = r5
            java.lang.Class<f6.g> r0 = p090f6.InterfaceC2072g.class
            java.lang.String r0 = r0.getSimpleName()
            r4[r1] = r0
            java.lang.String r0 = "Unable to call %s on %s."
            r3.m6377b(r7, r0, r4)
        L2e:
            return r2
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            f6.b r0 = r2.f9475b
            if (r0 == 0) goto L13
            r1 = 1
            r0.f9470e = r1
            f6.a r1 = r0.f9471f
            if (r1 == 0) goto L10
            r1.mo815e(r3)
        L10:
            r3 = 0
            r0.f9469d = r3
        L13:
            return
    }
}
