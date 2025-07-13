package p134hh;

/* renamed from: hh.h */
/* loaded from: classes.dex */
public abstract class AbstractC3047h extends p134hh.AbstractC3046g implements p239nh.InterfaceC4827g<java.lang.Object> {

    /* renamed from: Z */
    public final int f12251Z;

    public AbstractC3047h(int r1, p101fh.InterfaceC2172d<java.lang.Object> r2) {
            r0 = this;
            r0.<init>(r2)
            r0.f12251Z = r1
            return
    }

    @Override // p239nh.InterfaceC4827g
    /* renamed from: g */
    public int mo7456g() {
            r1 = this;
            int r0 = r1.f12251Z
            return r0
    }

    @Override // p134hh.AbstractC3040a
    public java.lang.String toString() {
            r2 = this;
            fh.d<java.lang.Object> r0 = r2.f12242Y
            if (r0 != 0) goto L10
            nh.s r0 = p239nh.C4838r.f19233a
            java.lang.String r0 = r0.m10854a(r2)
            java.lang.String r1 = "renderLambdaToString(this)"
            p214m2.C4339q.m9705j(r0, r1)
            goto L14
        L10:
            java.lang.String r0 = super.toString()
        L14:
            return r0
    }
}
