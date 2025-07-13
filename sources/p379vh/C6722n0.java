package p379vh;

/* renamed from: vh.n0 */
/* loaded from: classes.dex */
public final class C6722n0 implements p379vh.InterfaceC6752x0 {

    /* renamed from: Y */
    public final boolean f26011Y;

    public C6722n0(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.f26011Y = r1
            return
    }

    @Override // p379vh.InterfaceC6752x0
    /* renamed from: a */
    public boolean mo13568a() {
            r1 = this;
            boolean r0 = r1.f26011Y
            return r0
    }

    @Override // p379vh.InterfaceC6752x0
    /* renamed from: c */
    public p379vh.C6717l1 mo13569c() {
            r1 = this;
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Empty{"
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            boolean r1 = r3.f26011Y
            if (r1 == 0) goto Ld
            java.lang.String r1 = "Active"
            goto Lf
        Ld:
            java.lang.String r1 = "New"
        Lf:
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = p185k7.C3814g5.m8552a(r0, r1, r2)
            return r0
    }
}
