package gb;

/* renamed from: gb.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C2312b implements p327s7.InterfaceC5984h, p327s7.InterfaceC5977a {

    /* renamed from: Y */
    public final /* synthetic */ gb.C2313c f10534Y;

    public /* synthetic */ C2312b(gb.C2313c r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f10534Y = r1
            return
    }

    @Override // p327s7.InterfaceC5977a
    /* renamed from: g */
    public java.lang.Object mo816g(p327s7.AbstractC5985i r5) {
            r4 = this;
            gb.c r0 = r4.f10534Y
            java.util.Objects.requireNonNull(r0)
            boolean r1 = r5.mo12455m()
            if (r1 == 0) goto L5d
            hb.c r1 = r0.f10537c
            monitor-enter(r1)
            r2 = 0
            s7.i r2 = p327s7.C5988l.m12464e(r2)     // Catch: java.lang.Throwable -> L5a
            r1.f12097c = r2     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            hb.g r1 = r1.f12096b
            monitor-enter(r1)
            android.content.Context r2 = r1.f12115a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r1.f12116b     // Catch: java.lang.Throwable -> L57
            r2.deleteFile(r3)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)
            java.lang.Object r1 = r5.mo12451i()
            if (r1 == 0) goto L4e
            java.lang.Object r5 = r5.mo12451i()
            hb.d r5 = (p128hb.C2999d) r5
            org.json.JSONArray r5 = r5.f12103d
            java.lang.String r1 = "FirebaseRemoteConfig"
            p9.c r2 = r0.f10535a
            if (r2 != 0) goto L36
            goto L55
        L36:
            java.util.List r5 = gb.C2313c.m6075b(r5)     // Catch: p273p9.C5376a -> L40 org.json.JSONException -> L47
            p9.c r0 = r0.f10535a     // Catch: p273p9.C5376a -> L40 org.json.JSONException -> L47
            r0.m11731c(r5)     // Catch: p273p9.C5376a -> L40 org.json.JSONException -> L47
            goto L55
        L40:
            r5 = move-exception
            java.lang.String r0 = "Could not update ABT experiments."
            android.util.Log.w(r1, r0, r5)
            goto L55
        L47:
            r5 = move-exception
            java.lang.String r0 = "Could not parse ABT experiments from the JSON response."
            android.util.Log.e(r1, r0, r5)
            goto L55
        L4e:
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r0 = "Activated configs written to disk are null."
            android.util.Log.e(r5, r0)
        L55:
            r5 = 1
            goto L5e
        L57:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        L5a:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            throw r5
        L5d:
            r5 = 0
        L5e:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
    }

    @Override // p327s7.InterfaceC5984h
    /* renamed from: k */
    public p327s7.AbstractC5985i mo3892k(java.lang.Object r6) {
            r5 = this;
            gb.c r0 = r5.f10534Y
            java.lang.Void r6 = (java.lang.Void) r6
            hb.c r6 = r0.f10537c
            s7.i r6 = r6.m7370b()
            hb.c r1 = r0.f10538d
            s7.i r1 = r1.m7370b()
            r2 = 2
            s7.i[] r2 = new p327s7.AbstractC5985i[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r1
            s7.i r2 = p327s7.C5988l.m12466g(r2)
            java.util.concurrent.Executor r3 = r0.f10536b
            z3.a r4 = new z3.a
            r4.<init>(r0, r6, r1)
            s7.i r6 = r2.mo12449g(r3, r4)
            return r6
    }
}
