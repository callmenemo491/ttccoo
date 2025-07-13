package p179k1;

/* renamed from: k1.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C3647e implements p241o.InterfaceC4866a, p021b4.C0674k.b, p392wa.InterfaceC6822a.a {

    /* renamed from: Y */
    public final /* synthetic */ int f16133Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String f16134Z;

    public /* synthetic */ C3647e(java.lang.String r2, int r3) {
            r1 = this;
            r1.f16133Y = r3
            r0 = 1
            if (r3 == r0) goto Lc
            r0 = 2
            r1.<init>()
            r1.f16134Z = r2
            return
        Lc:
            r1.<init>()
            r1.f16134Z = r2
            return
    }

    @Override // p241o.InterfaceC4866a
    public java.lang.Object apply(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.f16133Y
            r1 = 0
            switch(r0) {
                case 0: goto L7;
                default: goto L6;
            }
        L6:
            goto Lf
        L7:
            java.lang.String r0 = r3.f16134Z
            o1.a r4 = (p243o1.InterfaceC4871a) r4
            r4.mo11018s(r0)
            return r1
        Lf:
            java.lang.String r0 = r3.f16134Z
            android.database.sqlite.SQLiteDatabase r4 = (android.database.sqlite.SQLiteDatabase) r4
            t3.b r2 = p021b4.C0674k.f3843c0
            android.database.sqlite.SQLiteStatement r0 = r4.compileStatement(r0)
            r0.execute()
            java.lang.String r0 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r4 = r4.compileStatement(r0)
            r4.execute()
            return r1
    }

    @Override // p392wa.InterfaceC6822a.a
    /* renamed from: c */
    public void mo25c(p392wa.InterfaceC6823b r2) {
            r1 = this;
            java.lang.String r0 = r1.f16134Z
            java.lang.Object r2 = r2.get()
            aa.a r2 = (p011aa.InterfaceC0045a) r2
            r2.mo45a(r0)
            return
    }
}
