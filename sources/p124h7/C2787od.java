package p124h7;

/* renamed from: h7.od */
/* loaded from: classes.dex */
public final class C2787od extends p124h7.C2624fc {

    /* renamed from: c */
    public final java.lang.String f11805c;

    /* renamed from: d */
    public final /* synthetic */ p124h7.C2841rd f11806d;

    public C2787od(p124h7.C2841rd r1, p124h7.C2624fc r2, java.lang.String r3) {
            r0 = this;
            r0.f11806d = r1
            h7.pc r1 = r2.f11514a
            r6.a r2 = r2.f11515b
            r0.<init>(r1, r2)
            r0.f11805c = r3
            return
    }

    @Override // p124h7.C2624fc
    /* renamed from: b */
    public final void mo6714b(java.lang.String r6) {
            r5 = this;
            r6.a r0 = p124h7.C2841rd.f11885d
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "onCodeSent"
            r0.m12160a(r2, r1)
            h7.rd r0 = r5.f11806d
            java.util.HashMap<java.lang.String, h7.qd> r0 = r0.f11888c
            java.lang.String r1 = r5.f11805c
            java.lang.Object r0 = r0.get(r1)
            h7.qd r0 = (p124h7.C2823qd) r0
            if (r0 != 0) goto L19
            return
        L19:
            java.util.List<h7.fc> r1 = r0.f11856b
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            h7.fc r2 = (p124h7.C2624fc) r2
            r2.mo6714b(r6)
            goto L1f
        L2f:
            r1 = 1
            r0.f11861g = r1
            r0.f11858d = r6
            long r1 = r0.f11855a
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L44
            h7.rd r6 = r5.f11806d
            java.lang.String r0 = r5.f11805c
            r6.m7107i(r0)
            return
        L44:
            boolean r6 = r0.f11857c
            if (r6 != 0) goto L50
            h7.rd r6 = r5.f11806d
            java.lang.String r0 = r5.f11805c
            r6.m7106h(r0)
            return
        L50:
            java.lang.String r6 = r0.f11859e
            boolean r6 = p036c6.C0906q0.m2629q(r6)
            if (r6 != 0) goto L5f
            h7.rd r6 = r5.f11806d
            java.lang.String r0 = r5.f11805c
            p124h7.C2841rd.m7099b(r6, r0)
        L5f:
            return
    }

    @Override // p124h7.C2624fc
    /* renamed from: d */
    public final void mo6716d(com.google.android.gms.common.api.Status r7) {
            r6 = this;
            r6.a r0 = p124h7.C2841rd.f11885d
            int r1 = r7.f5536Z
            java.lang.String r1 = p036c6.C0883f.m2597a(r1)
            java.lang.String r2 = r7.f5537a0
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.String r4 = java.lang.String.valueOf(r2)
            int r4 = r4.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r3 = r3 + 39
            int r3 = r3 + r4
            r5.<init>(r3)
            java.lang.String r3 = "SMS verification code request failed: "
            r5.append(r3)
            r5.append(r1)
            java.lang.String r1 = " "
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = r5.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0.m12161b(r1, r2)
            h7.rd r0 = r6.f11806d
            java.util.HashMap<java.lang.String, h7.qd> r0 = r0.f11888c
            java.lang.String r1 = r6.f11805c
            java.lang.Object r0 = r0.get(r1)
            h7.qd r0 = (p124h7.C2823qd) r0
            if (r0 != 0) goto L4b
            return
        L4b:
            java.util.List<h7.fc> r0 = r0.f11856b
            java.util.Iterator r0 = r0.iterator()
        L51:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L61
            java.lang.Object r1 = r0.next()
            h7.fc r1 = (p124h7.C2624fc) r1
            r1.mo6716d(r7)
            goto L51
        L61:
            h7.rd r7 = r6.f11806d
            java.lang.String r0 = r6.f11805c
            r7.m7103d(r0)
            return
    }
}
