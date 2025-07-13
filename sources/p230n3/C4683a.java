package p230n3;

import p245o3.InterfaceC4888a;

/* renamed from: n3.a */
/* loaded from: classes.dex */
public class C4683a<T extends p245o3.InterfaceC4888a> implements p230n3.InterfaceC4685c {

    /* renamed from: a */
    public T f18649a;

    /* renamed from: b */
    public java.util.List<p230n3.C4684b> f18650b;

    public C4683a(T r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f18650b = r0
            r1.f18649a = r2
            return
    }

    @Override // p230n3.InterfaceC4685c
    /* renamed from: a */
    public p230n3.C4684b mo10718a(float r4, float r5) {
            r3 = this;
            T extends o3.a r0 = r3.f18649a
            k3.i$a r1 = p181k3.C3685i.a.f16312Y
            s3.e r0 = r0.mo7775a(r1)
            s3.b r0 = r0.m12367b(r4, r5)
            double r1 = r0.f22835b
            float r1 = (float) r1
            s3.d<s3.b> r2 = p323s3.C5948b.f22834d
            r2.m12363c(r0)
            n3.b r4 = r3.m10722e(r1, r4, r5)
            return r4
    }

    /* renamed from: b */
    public java.util.List<p230n3.C4684b> m10719b(p267p3.InterfaceC5350d r11, int r12, float r13, p198l3.AbstractC4171e.a r14) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r11.mo9263t(r13)
            int r2 = r1.size()
            if (r2 != 0) goto L1f
            r2 = 2143289344(0x7fc00000, float:NaN)
            l3.f r13 = r11.mo9264u(r13, r2, r14)
            if (r13 == 0) goto L1f
            float r13 = r13.mo9267b()
            java.util.List r1 = r11.mo9263t(r13)
        L1f:
            int r13 = r1.size()
            if (r13 != 0) goto L26
            return r0
        L26:
            java.util.Iterator r13 = r1.iterator()
        L2a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L69
            java.lang.Object r14 = r13.next()
            l3.f r14 = (p198l3.C4172f) r14
            T extends o3.a r1 = r10.f18649a
            k3.i$a r2 = r11.mo9228L()
            s3.e r1 = r1.mo7775a(r2)
            float r2 = r14.mo9267b()
            float r3 = r14.m9246a()
            s3.b r1 = r1.m12366a(r2, r3)
            n3.b r9 = new n3.b
            float r3 = r14.mo9267b()
            float r4 = r14.m9246a()
            double r5 = r1.f22835b
            float r5 = (float) r5
            double r1 = r1.f22836c
            float r6 = (float) r1
            k3.i$a r8 = r11.mo9228L()
            r2 = r9
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.add(r9)
            goto L2a
        L69:
            return r0
    }

    /* renamed from: c */
    public p198l3.AbstractC4167a m10720c() {
            r1 = this;
            T extends o3.a r0 = r1.f18649a
            l3.a r0 = r0.getData()
            return r0
    }

    /* renamed from: d */
    public float m10721d(float r3, float r4, float r5, float r6) {
            r2 = this;
            float r3 = r3 - r5
            double r0 = (double) r3
            float r4 = r4 - r6
            double r3 = (double) r4
            double r3 = java.lang.Math.hypot(r0, r3)
            float r3 = (float) r3
            return r3
    }

    /* renamed from: e */
    public p230n3.C4684b m10722e(float r8, float r9, float r10) {
            r7 = this;
            java.util.List<n3.b> r0 = r7.f18650b
            r0.clear()
            l3.a r0 = r7.m10720c()
            r1 = 0
            if (r0 != 0) goto Lf
        Lc:
            java.util.List<n3.b> r8 = r7.f18650b
            goto L2f
        Lf:
            int r2 = r0.m9249c()
            r3 = 0
        L14:
            if (r3 >= r2) goto Lc
            p3.d r4 = r0.m9248b(r3)
            boolean r5 = r4.mo9234T()
            if (r5 != 0) goto L21
            goto L2c
        L21:
            java.util.List<n3.b> r5 = r7.f18650b
            l3.e$a r6 = p198l3.AbstractC4171e.a.f17286a0
            java.util.List r4 = r7.m10719b(r4, r3, r8, r6)
            r5.addAll(r4)
        L2c:
            int r3 = r3 + 1
            goto L14
        L2f:
            boolean r0 = r8.isEmpty()
            r2 = 0
            if (r0 == 0) goto L37
            return r2
        L37:
            k3.i$a r0 = p181k3.C3685i.a.f16312Y
            float r3 = r7.m10723f(r8, r10, r0)
            k3.i$a r4 = p181k3.C3685i.a.f16313Z
            float r5 = r7.m10723f(r8, r10, r4)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L48
            goto L49
        L48:
            r0 = r4
        L49:
            T extends o3.a r3 = r7.f18649a
            float r3 = r3.getMaxHighlightDistance()
        L4f:
            int r4 = r8.size()
            if (r1 >= r4) goto L70
            java.lang.Object r4 = r8.get(r1)
            n3.b r4 = (p230n3.C4684b) r4
            k3.i$a r5 = r4.f18658h
            if (r5 != r0) goto L6d
            float r5 = r4.f18653c
            float r6 = r4.f18654d
            float r5 = r7.m10721d(r9, r10, r5, r6)
            int r6 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r6 >= 0) goto L6d
            r2 = r4
            r3 = r5
        L6d:
            int r1 = r1 + 1
            goto L4f
        L70:
            return r2
    }

    /* renamed from: f */
    public float m10723f(java.util.List<p230n3.C4684b> r5, float r6, p181k3.C3685i.a r7) {
            r4 = this;
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = 0
        L4:
            int r2 = r5.size()
            if (r1 >= r2) goto L23
            java.lang.Object r2 = r5.get(r1)
            n3.b r2 = (p230n3.C4684b) r2
            k3.i$a r3 = r2.f18658h
            if (r3 != r7) goto L20
            float r2 = r2.f18654d
            float r2 = r2 - r6
            float r2 = java.lang.Math.abs(r2)
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 >= 0) goto L20
            r0 = r2
        L20:
            int r1 = r1 + 1
            goto L4
        L23:
            return r0
    }
}
