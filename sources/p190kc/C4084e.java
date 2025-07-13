package p190kc;

/* renamed from: kc.e */
/* loaded from: classes.dex */
public final class C4084e extends p190kc.AbstractC4088i {

    /* renamed from: c */
    public final java.lang.String f17003c;

    /* renamed from: d */
    public final java.lang.String f17004d;

    public C4084e(p453zb.C7269a r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f17003c = r3
            r0.f17004d = r2
            return
    }

    @Override // p190kc.AbstractC4089j
    /* renamed from: a */
    public java.lang.String mo9176a() {
            r6 = this;
            zb.a r0 = r6.f17005a
            int r0 = r0.f27901Z
            r1 = 84
            if (r0 != r1) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 8
            r6.m9177b(r0, r1)
            r1 = 20
            r2 = 48
            r6.m9179f(r0, r2, r1)
            r1 = 68
            androidx.fragment.app.l0 r3 = r6.f17006b
            r4 = 16
            java.util.ArrayList<androidx.fragment.app.n> r3 = r3.f2230Z
            zb.a r3 = (p453zb.C7269a) r3
            int r1 = androidx.fragment.app.C0392l0.m1242t(r3, r1, r4)
            r3 = 38400(0x9600, float:5.381E-41)
            if (r1 != r3) goto L2d
            goto L64
        L2d:
            r3 = 40
            r0.append(r3)
            java.lang.String r3 = r6.f17003c
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            int r3 = r1 % 32
            int r1 = r1 / 32
            int r4 = r1 % 12
            int r4 = r4 + 1
            int r1 = r1 / 12
            int r5 = r1 / 10
            if (r5 != 0) goto L4d
            r0.append(r2)
        L4d:
            r0.append(r1)
            int r1 = r4 / 10
            if (r1 != 0) goto L57
            r0.append(r2)
        L57:
            r0.append(r4)
            int r1 = r3 / 10
            if (r1 != 0) goto L61
            r0.append(r2)
        L61:
            r0.append(r3)
        L64:
            java.lang.String r0 = r0.toString()
            return r0
        L69:
            sb.k r0 = sb.C6017k.f23200a0
            throw r0
    }

    @Override // p190kc.AbstractC4088i
    /* renamed from: d */
    public void mo9174d(java.lang.StringBuilder r2, int r3) {
            r1 = this;
            r0 = 40
            r2.append(r0)
            java.lang.String r0 = r1.f17004d
            r2.append(r0)
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r3 = r3 / r0
            r2.append(r3)
            r3 = 41
            r2.append(r3)
            return
    }

    @Override // p190kc.AbstractC4088i
    /* renamed from: e */
    public int mo9175e(int r2) {
            r1 = this;
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r2 = r2 % r0
            return r2
    }
}
