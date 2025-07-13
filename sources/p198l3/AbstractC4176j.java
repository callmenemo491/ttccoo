package p198l3;

import p198l3.C4172f;

/* renamed from: l3.j */
/* loaded from: classes.dex */
public abstract class AbstractC4176j<T extends p198l3.C4172f> implements p267p3.InterfaceC5353g<T>, p267p3.InterfaceC5348b {

    /* renamed from: t */
    public int f17303t;

    /* renamed from: u */
    public boolean f17304u;

    /* renamed from: v */
    public boolean f17305v;

    /* renamed from: w */
    public float f17306w;

    public AbstractC4176j(java.util.List<T> r2, java.lang.String r3) {
            r1 = this;
            r1.<init>(r2, r3)
            r2 = 255(0xff, float:3.57E-43)
            r3 = 187(0xbb, float:2.62E-43)
            r0 = 115(0x73, float:1.61E-43)
            int r2 = android.graphics.Color.rgb(r2, r3, r0)
            r1.f17303t = r2
            r2 = 1
            r1.f17304u = r2
            r1.f17305v = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.f17306w = r2
            float r2 = p323s3.AbstractC5952f.m12377d(r2)
            r1.f17306w = r2
            return
    }

    @Override // p267p3.InterfaceC5348b
    /* renamed from: H */
    public int mo9285H() {
            r1 = this;
            int r0 = r1.f17303t
            return r0
    }

    @Override // p267p3.InterfaceC5353g
    /* renamed from: U */
    public boolean mo9286U() {
            r1 = this;
            boolean r0 = r1.f17304u
            return r0
    }

    @Override // p267p3.InterfaceC5353g
    /* renamed from: b0 */
    public boolean mo9287b0() {
            r1 = this;
            boolean r0 = r1.f17305v
            return r0
    }

    @Override // p267p3.InterfaceC5353g
    /* renamed from: k */
    public android.graphics.DashPathEffect mo9288k() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p267p3.InterfaceC5353g
    /* renamed from: z */
    public float mo9289z() {
            r1 = this;
            float r0 = r1.f17306w
            return r0
    }
}
