package p222mb;

/* renamed from: mb.r */
/* loaded from: classes.dex */
public class C4527r implements p169jb.InterfaceC3458a0 {

    /* renamed from: Y */
    public final /* synthetic */ java.lang.Class f18410Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Class f18411Z;

    /* renamed from: a0 */
    public final /* synthetic */ p169jb.AbstractC3483z f18412a0;

    public C4527r(java.lang.Class r1, java.lang.Class r2, p169jb.AbstractC3483z r3) {
            r0 = this;
            r0.f18410Y = r1
            r0.f18411Z = r2
            r0.f18412a0 = r3
            r0.<init>()
            return
    }

    @Override // p169jb.InterfaceC3458a0
    /* renamed from: a */
    public <T> p169jb.AbstractC3483z<T> mo7921a(p169jb.C3467j r1, p274pb.C5380a<T> r2) {
            r0 = this;
            java.lang.Class<? super T> r1 = r2.f21381a
            java.lang.Class r2 = r0.f18410Y
            if (r1 == r2) goto Ld
            java.lang.Class r2 = r0.f18411Z
            if (r1 != r2) goto Lb
            goto Ld
        Lb:
            r1 = 0
            goto Lf
        Ld:
            jb.z r1 = r0.f18412a0
        Lf:
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Factory[type="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.lang.Class r1 = r2.f18410Y
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class r1 = r2.f18411Z
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            jb.z r1 = r2.f18412a0
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
