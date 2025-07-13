package p198l3;

/* renamed from: l3.h */
/* loaded from: classes.dex */
public class C4174h extends p198l3.AbstractC4175i<p198l3.C4172f> implements p267p3.InterfaceC5351e {

    /* renamed from: C */
    public int f17289C;

    /* renamed from: D */
    public java.util.List<java.lang.Integer> f17290D;

    /* renamed from: E */
    public int f17291E;

    /* renamed from: F */
    public float f17292F;

    /* renamed from: G */
    public float f17293G;

    /* renamed from: H */
    public float f17294H;

    /* renamed from: I */
    public p367v1.C6488b f17295I;

    /* renamed from: J */
    public boolean f17296J;

    /* renamed from: K */
    public boolean f17297K;

    public C4174h(java.util.List<p198l3.C4172f> r3, java.lang.String r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r3 = 1
            r2.f17289C = r3
            r4 = 0
            r2.f17290D = r4
            r4 = -1
            r2.f17291E = r4
            r4 = 1090519040(0x41000000, float:8.0)
            r2.f17292F = r4
            r4 = 1082130432(0x40800000, float:4.0)
            r2.f17293G = r4
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            r2.f17294H = r4
            v1.b r4 = new v1.b
            r0 = 5
            r4.<init>(r0)
            r2.f17295I = r4
            r2.f17296J = r3
            r2.f17297K = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f17290D = r3
            r3.clear()
            java.util.List<java.lang.Integer> r3 = r2.f17290D
            r4 = 140(0x8c, float:1.96E-43)
            r0 = 234(0xea, float:3.28E-43)
            r1 = 255(0xff, float:3.57E-43)
            int r4 = android.graphics.Color.rgb(r4, r0, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            return
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: F */
    public float mo9268F() {
            r1 = this;
            float r0 = r1.f17294H
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: I */
    public android.graphics.DashPathEffect mo9269I() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: J */
    public int mo9270J(int r2) {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.f17290D
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: S */
    public boolean mo9271S() {
            r1 = this;
            boolean r0 = r1.f17296J
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: V */
    public int mo9272V() {
            r1 = this;
            int r0 = r1.f17289C
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: Y */
    public float mo9273Y() {
            r1 = this;
            float r0 = r1.f17293G
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: Z */
    public float mo9274Z() {
            r1 = this;
            float r0 = r1.f17292F
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: c */
    public int mo9275c() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.f17290D
            int r0 = r0.size()
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: e0 */
    public boolean mo9276e0() {
            r1 = this;
            boolean r0 = r1.f17297K
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: h */
    public p367v1.C6488b mo9277h() {
            r1 = this;
            v1.b r0 = r1.f17295I
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: r */
    public boolean mo9278r() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p267p3.InterfaceC5351e
    /* renamed from: w */
    public int mo9279w() {
            r1 = this;
            int r0 = r1.f17291E
            return r0
    }
}
