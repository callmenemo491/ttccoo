package p214m2;

/* renamed from: m2.a0 */
/* loaded from: classes.dex */
public class C4322a0 implements com.bumptech.glide.load.data.InterfaceC1016d.a<java.lang.Object> {

    /* renamed from: Y */
    public final /* synthetic */ p282q2.InterfaceC5556m.a f17622Y;

    /* renamed from: Z */
    public final /* synthetic */ p214m2.C4324b0 f17623Z;

    public C4322a0(p214m2.C4324b0 r1, p282q2.InterfaceC5556m.a r2) {
            r0 = this;
            r0.f17623Z = r1
            r0.f17622Y = r2
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d.a
    /* renamed from: c */
    public void mo2794c(java.lang.Exception r5) {
            r4 = this;
            m2.b0 r0 = r4.f17623Z
            q2.m$a r1 = r4.f17622Y
            q2.m$a<?> r0 = r0.f17630d0
            if (r0 == 0) goto Lc
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L20
            m2.b0 r0 = r4.f17623Z
            q2.m$a r1 = r4.f17622Y
            m2.g$a r2 = r0.f17626Z
            m2.e r0 = r0.f17631e0
            com.bumptech.glide.load.data.d<Data> r1 = r1.f21626c
            com.bumptech.glide.load.a r3 = r1.mo2792e()
            r2.mo9657g(r0, r5, r1, r3)
        L20:
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d.a
    /* renamed from: d */
    public void mo2795d(java.lang.Object r8) {
            r7 = this;
            m2.b0 r0 = r7.f17623Z
            q2.m$a r1 = r7.f17622Y
            q2.m$a<?> r0 = r0.f17630d0
            if (r0 == 0) goto Lc
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L42
            m2.b0 r0 = r7.f17623Z
            q2.m$a r1 = r7.f17622Y
            m2.h<?> r2 = r0.f17625Y
            m2.k r2 = r2.f17661p
            if (r8 == 0) goto L2d
            com.bumptech.glide.load.data.d<Data> r3 = r1.f21626c
            com.bumptech.glide.load.a r3 = r3.mo2792e()
            boolean r2 = r2.mo9682c(r3)
            if (r2 == 0) goto L2d
            r0.f17629c0 = r8
            m2.g$a r8 = r0.f17626Z
            r8.mo9656e()
            goto L42
        L2d:
            m2.g$a r2 = r0.f17626Z
            k2.c r3 = r1.f21624a
            com.bumptech.glide.load.data.d<Data> r4 = r1.f21626c
            com.bumptech.glide.load.a r5 = r4.mo2792e()
            m2.e r6 = r0.f17631e0
            r0 = r2
            r1 = r3
            r2 = r8
            r3 = r4
            r4 = r5
            r5 = r6
            r0.mo9658h(r1, r2, r3, r4, r5)
        L42:
            return
    }
}
