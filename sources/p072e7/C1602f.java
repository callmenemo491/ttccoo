package p072e7;

/* renamed from: e7.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C1602f implements p327s7.InterfaceC5981e, p327s7.InterfaceC5982f {

    /* renamed from: Y */
    public final /* synthetic */ p072e7.C1612g f7552Y;

    public /* synthetic */ C1602f(p072e7.C1612g r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L9
            r1.<init>()
            r1.f7552Y = r2
            return
        L9:
            r1.<init>()
            r1.f7552Y = r2
            return
    }

    @Override // p327s7.InterfaceC5981e
    /* renamed from: c */
    public void mo4109c(java.lang.Exception r7) {
            r6 = this;
            e7.g r0 = r6.f7552Y
            h6.b r1 = p072e7.C1612g.f7557f
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.String r4 = r1.f11253a
            java.lang.String r5 = "Error storing session"
            java.lang.String r1 = r1.m6380e(r5, r3)
            android.util.Log.w(r4, r1, r7)
            e7.x4<java.lang.Void> r7 = r0.f7561d
            if (r7 == 0) goto L19
            r7.cancel(r2)
        L19:
            return
    }

    @Override // p327s7.InterfaceC5982f
    /* renamed from: d */
    public void mo1270d(java.lang.Object r2) {
            r1 = this;
            e7.g r0 = r1.f7552Y
            c6.q r2 = (p036c6.C0905q) r2
            if (r2 != 0) goto L7
            goto L11
        L7:
            r0.f7562e = r2
            e7.x4<java.lang.Void> r2 = r0.f7561d
            if (r2 == 0) goto L11
            r0 = 0
            r2.m4485g(r0)
        L11:
            return
    }
}
