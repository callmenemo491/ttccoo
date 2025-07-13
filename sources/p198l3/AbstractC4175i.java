package p198l3;

import p198l3.C4172f;

/* renamed from: l3.i */
/* loaded from: classes.dex */
public abstract class AbstractC4175i<T extends p198l3.C4172f> extends p198l3.AbstractC4176j<T> implements p267p3.InterfaceC5352f<T> {

    /* renamed from: A */
    public float f17298A;

    /* renamed from: B */
    public boolean f17299B;

    /* renamed from: x */
    public int f17300x;

    /* renamed from: y */
    public android.graphics.drawable.Drawable f17301y;

    /* renamed from: z */
    public int f17302z;

    public AbstractC4175i(java.util.List<T> r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 140(0x8c, float:1.96E-43)
            r3 = 234(0xea, float:3.28E-43)
            r0 = 255(0xff, float:3.57E-43)
            int r2 = android.graphics.Color.rgb(r2, r3, r0)
            r1.f17300x = r2
            r2 = 85
            r1.f17302z = r2
            r2 = 1075838976(0x40200000, float:2.5)
            r1.f17298A = r2
            r2 = 0
            r1.f17299B = r2
            return
    }

    @Override // p267p3.InterfaceC5352f
    /* renamed from: K */
    public android.graphics.drawable.Drawable mo9280K() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f17301y
            return r0
    }

    @Override // p267p3.InterfaceC5352f
    /* renamed from: a0 */
    public boolean mo9281a0() {
            r1 = this;
            boolean r0 = r1.f17299B
            return r0
    }

    @Override // p267p3.InterfaceC5352f
    /* renamed from: e */
    public int mo9282e() {
            r1 = this;
            int r0 = r1.f17300x
            return r0
    }

    @Override // p267p3.InterfaceC5352f
    /* renamed from: f */
    public int mo9283f() {
            r1 = this;
            int r0 = r1.f17302z
            return r0
    }

    @Override // p267p3.InterfaceC5352f
    /* renamed from: n */
    public float mo9284n() {
            r1 = this;
            float r0 = r1.f17298A
            return r0
    }
}
