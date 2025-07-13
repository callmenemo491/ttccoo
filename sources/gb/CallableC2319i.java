package gb;

/* renamed from: gb.i */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC2319i implements java.util.concurrent.Callable {

    /* renamed from: a */
    public final /* synthetic */ int f10548a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f10549b;

    public /* synthetic */ CallableC2319i(gb.C2322l r2) {
            r1 = this;
            r0 = 0
            r1.f10548a = r0
            r1.<init>()
            r1.f10549b = r2
            return
    }

    public /* synthetic */ CallableC2319i(p128hb.C3002g r2) {
            r1 = this;
            r0 = 1
            r1.f10548a = r0
            r1.<init>()
            r1.f10549b = r2
            return
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
            r7 = this;
            int r0 = r7.f10548a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            java.lang.Object r0 = r7.f10549b
            gb.l r0 = (gb.C2322l) r0
            gb.c r0 = r0.m6081c()
            return r0
        Lf:
            java.lang.Object r0 = r7.f10549b
            hb.g r0 = (p128hb.C3002g) r0
            monitor-enter(r0)
            r1 = 0
            android.content.Context r2 = r0.f12115a     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L46
            java.lang.String r3 = r0.f12116b     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L46
            java.io.FileInputStream r2 = r2.openFileInput(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Throwable -> L46
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            r5 = 0
            r2.read(r4, r5, r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            java.lang.String r5 = "UTF-8"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            hb.d r1 = p128hb.C2999d.m7373a(r4)     // Catch: java.lang.Throwable -> L38 java.lang.Throwable -> L3d
            goto L49
        L38:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L40
        L3d:
            goto L47
        L3f:
            r2 = move-exception
        L40:
            if (r1 == 0) goto L45
            r1.close()     // Catch: java.lang.Throwable -> L4d
        L45:
            throw r2     // Catch: java.lang.Throwable -> L4d
        L46:
            r2 = r1
        L47:
            if (r2 == 0) goto L50
        L49:
            r2.close()     // Catch: java.lang.Throwable -> L4d
            goto L50
        L4d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L50:
            monitor-exit(r0)
            return r1
    }
}
