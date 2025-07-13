package p214m2;

/* renamed from: m2.d */
/* loaded from: classes.dex */
public class C4326d implements p214m2.InterfaceC4329g, com.bumptech.glide.load.data.InterfaceC1016d.a<java.lang.Object> {

    /* renamed from: Y */
    public final java.util.List<p180k2.InterfaceC3671c> f17632Y;

    /* renamed from: Z */
    public final p214m2.C4330h<?> f17633Z;

    /* renamed from: a0 */
    public final p214m2.InterfaceC4329g.a f17634a0;

    /* renamed from: b0 */
    public int f17635b0;

    /* renamed from: c0 */
    public p180k2.InterfaceC3671c f17636c0;

    /* renamed from: d0 */
    public java.util.List<p282q2.InterfaceC5556m<java.io.File, ?>> f17637d0;

    /* renamed from: e0 */
    public int f17638e0;

    /* renamed from: f0 */
    public volatile p282q2.InterfaceC5556m.a<?> f17639f0;

    /* renamed from: g0 */
    public java.io.File f17640g0;

    public C4326d(java.util.List<p180k2.InterfaceC3671c> r2, p214m2.C4330h<?> r3, p214m2.InterfaceC4329g.a r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f17635b0 = r0
            r1.f17632Y = r2
            r1.f17633Z = r3
            r1.f17634a0 = r4
            return
    }

    public C4326d(p214m2.C4330h<?> r3, p214m2.InterfaceC4329g.a r4) {
            r2 = this;
            java.util.List r0 = r3.m9659a()
            r2.<init>()
            r1 = -1
            r2.f17635b0 = r1
            r2.f17632Y = r0
            r2.f17633Z = r3
            r2.f17634a0 = r4
            return
    }

    @Override // p214m2.InterfaceC4329g
    /* renamed from: a */
    public boolean mo9655a() {
            r8 = this;
        L0:
            java.util.List<q2.m<java.io.File, ?>> r0 = r8.f17637d0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L69
            int r3 = r8.f17638e0
            int r0 = r0.size()
            if (r3 >= r0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 != 0) goto L14
            goto L69
        L14:
            r0 = 0
            r8.f17639f0 = r0
            r0 = 0
        L18:
            if (r0 != 0) goto L68
            int r3 = r8.f17638e0
            java.util.List<q2.m<java.io.File, ?>> r4 = r8.f17637d0
            int r4 = r4.size()
            if (r3 >= r4) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            if (r3 == 0) goto L68
            java.util.List<q2.m<java.io.File, ?>> r3 = r8.f17637d0
            int r4 = r8.f17638e0
            int r5 = r4 + 1
            r8.f17638e0 = r5
            java.lang.Object r3 = r3.get(r4)
            q2.m r3 = (p282q2.InterfaceC5556m) r3
            java.io.File r4 = r8.f17640g0
            m2.h<?> r5 = r8.f17633Z
            int r6 = r5.f17650e
            int r7 = r5.f17651f
            k2.e r5 = r5.f17654i
            q2.m$a r3 = r3.mo9582a(r4, r6, r7, r5)
            r8.f17639f0 = r3
            q2.m$a<?> r3 = r8.f17639f0
            if (r3 == 0) goto L18
            m2.h<?> r3 = r8.f17633Z
            q2.m$a<?> r4 = r8.f17639f0
            com.bumptech.glide.load.data.d<Data> r4 = r4.f21626c
            java.lang.Class r4 = r4.mo2786a()
            boolean r3 = r3.m9665g(r4)
            if (r3 == 0) goto L18
            q2.m$a<?> r0 = r8.f17639f0
            com.bumptech.glide.load.data.d<Data> r0 = r0.f21626c
            m2.h<?> r3 = r8.f17633Z
            com.bumptech.glide.g r3 = r3.f17660o
            r0.mo2793f(r3, r8)
            r0 = 1
            goto L18
        L68:
            return r0
        L69:
            int r0 = r8.f17635b0
            int r0 = r0 + r2
            r8.f17635b0 = r0
            java.util.List<k2.c> r2 = r8.f17632Y
            int r2 = r2.size()
            if (r0 < r2) goto L77
            return r1
        L77:
            java.util.List<k2.c> r0 = r8.f17632Y
            int r2 = r8.f17635b0
            java.lang.Object r0 = r0.get(r2)
            k2.c r0 = (p180k2.InterfaceC3671c) r0
            m2.e r2 = new m2.e
            m2.h<?> r3 = r8.f17633Z
            k2.c r4 = r3.f17659n
            r2.<init>(r0, r4)
            o2.a r3 = r3.m9660b()
            java.io.File r2 = r3.mo11024a(r2)
            r8.f17640g0 = r2
            if (r2 == 0) goto L0
            r8.f17636c0 = r0
            m2.h<?> r0 = r8.f17633Z
            com.bumptech.glide.e r0 = r0.f17648c
            com.bumptech.glide.h r0 = r0.f5124b
            java.util.List r0 = r0.m2744f(r2)
            r8.f17637d0 = r0
            r8.f17638e0 = r1
            goto L0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d.a
    /* renamed from: c */
    public void mo2794c(java.lang.Exception r5) {
            r4 = this;
            m2.g$a r0 = r4.f17634a0
            k2.c r1 = r4.f17636c0
            q2.m$a<?> r2 = r4.f17639f0
            com.bumptech.glide.load.data.d<Data> r2 = r2.f21626c
            com.bumptech.glide.load.a r3 = com.bumptech.glide.load.EnumC1008a.f5182a0
            r0.mo9657g(r1, r5, r2, r3)
            return
    }

    @Override // p214m2.InterfaceC4329g
    public void cancel() {
            r1 = this;
            q2.m$a<?> r0 = r1.f17639f0
            if (r0 == 0) goto L9
            com.bumptech.glide.load.data.d<Data> r0 = r0.f21626c
            r0.cancel()
        L9:
            return
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d.a
    /* renamed from: d */
    public void mo2795d(java.lang.Object r7) {
            r6 = this;
            m2.g$a r0 = r6.f17634a0
            k2.c r1 = r6.f17636c0
            q2.m$a<?> r2 = r6.f17639f0
            com.bumptech.glide.load.data.d<Data> r3 = r2.f21626c
            com.bumptech.glide.load.a r4 = com.bumptech.glide.load.EnumC1008a.f5182a0
            k2.c r5 = r6.f17636c0
            r2 = r7
            r0.mo9658h(r1, r2, r3, r4, r5)
            return
    }
}
