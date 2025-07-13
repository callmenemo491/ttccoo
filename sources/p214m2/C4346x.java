package p214m2;

/* renamed from: m2.x */
/* loaded from: classes.dex */
public class C4346x implements p214m2.InterfaceC4329g, com.bumptech.glide.load.data.InterfaceC1016d.a<java.lang.Object> {

    /* renamed from: Y */
    public final p214m2.InterfaceC4329g.a f17815Y;

    /* renamed from: Z */
    public final p214m2.C4330h<?> f17816Z;

    /* renamed from: a0 */
    public int f17817a0;

    /* renamed from: b0 */
    public int f17818b0;

    /* renamed from: c0 */
    public p180k2.InterfaceC3671c f17819c0;

    /* renamed from: d0 */
    public java.util.List<p282q2.InterfaceC5556m<java.io.File, ?>> f17820d0;

    /* renamed from: e0 */
    public int f17821e0;

    /* renamed from: f0 */
    public volatile p282q2.InterfaceC5556m.a<?> f17822f0;

    /* renamed from: g0 */
    public java.io.File f17823g0;

    /* renamed from: h0 */
    public p214m2.C4347y f17824h0;

    public C4346x(p214m2.C4330h<?> r2, p214m2.InterfaceC4329g.a r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f17818b0 = r0
            r1.f17816Z = r2
            r1.f17815Y = r3
            return
    }

    @Override // p214m2.InterfaceC4329g
    /* renamed from: a */
    public boolean mo9655a() {
            r21 = this;
            r1 = r21
            m2.h<?> r0 = r1.f17816Z
            java.util.List r0 = r0.m9659a()
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto L10
            return r3
        L10:
            m2.h<?> r2 = r1.f17816Z
            com.bumptech.glide.e r4 = r2.f17648c
            com.bumptech.glide.h r4 = r4.f5124b
            java.lang.Object r5 = r2.f17649d
            java.lang.Class r5 = r5.getClass()
            java.lang.Class<?> r6 = r2.f17652g
            java.lang.Class<Transcode> r2 = r2.f17656k
            androidx.appcompat.widget.x r7 = r4.f5147h
            java.lang.Object r8 = r7.f1481Z
            java.util.concurrent.atomic.AtomicReference r8 = (java.util.concurrent.atomic.AtomicReference) r8
            r9 = 0
            java.lang.Object r8 = r8.getAndSet(r9)
            g3.i r8 = (p106g3.C2237i) r8
            if (r8 != 0) goto L35
            g3.i r8 = new g3.i
            r8.<init>(r5, r6, r2)
            goto L3b
        L35:
            r8.f10211a = r5
            r8.f10212b = r6
            r8.f10213c = r2
        L3b:
            java.lang.Object r10 = r7.f1482a0
            s.a r10 = (p319s.C5934a) r10
            monitor-enter(r10)
            java.lang.Object r11 = r7.f1482a0     // Catch: java.lang.Throwable -> L1d4
            s.a r11 = (p319s.C5934a) r11     // Catch: java.lang.Throwable -> L1d4
            java.lang.Object r11 = r11.getOrDefault(r8, r9)     // Catch: java.lang.Throwable -> L1d4
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Throwable -> L1d4
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d4
            java.lang.Object r7 = r7.f1481Z
            java.util.concurrent.atomic.AtomicReference r7 = (java.util.concurrent.atomic.AtomicReference) r7
            r7.set(r8)
            if (r11 != 0) goto Lc4
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            q2.o r7 = r4.f5140a
            monitor-enter(r7)
            q2.q r8 = r7.f21627a     // Catch: java.lang.Throwable -> Lc1
            java.util.List r8 = r8.m11843d(r5)     // Catch: java.lang.Throwable -> Lc1
            monitor-exit(r7)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r7 = r8.iterator()
        L69:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La5
            java.lang.Object r8 = r7.next()
            java.lang.Class r8 = (java.lang.Class) r8
            b3.d r10 = r4.f5142c
            java.util.List r8 = r10.m2213b(r8, r6)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
        L81:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L69
            java.lang.Object r10 = r8.next()
            java.lang.Class r10 = (java.lang.Class) r10
            y2.c r12 = r4.f5145f
            java.util.List r12 = r12.m14217a(r10, r2)
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L81
            boolean r12 = r11.contains(r10)
            if (r12 != 0) goto L81
            r11.add(r10)
            goto L81
        La5:
            androidx.appcompat.widget.x r4 = r4.f5147h
            java.util.List r7 = java.util.Collections.unmodifiableList(r11)
            java.lang.Object r8 = r4.f1482a0
            s.a r8 = (p319s.C5934a) r8
            monitor-enter(r8)
            java.lang.Object r4 = r4.f1482a0     // Catch: java.lang.Throwable -> Lbe
            s.a r4 = (p319s.C5934a) r4     // Catch: java.lang.Throwable -> Lbe
            g3.i r10 = new g3.i     // Catch: java.lang.Throwable -> Lbe
            r10.<init>(r5, r6, r2)     // Catch: java.lang.Throwable -> Lbe
            r4.put(r10, r7)     // Catch: java.lang.Throwable -> Lbe
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lbe
            goto Lc4
        Lbe:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lbe
            throw r0
        Lc1:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        Lc4:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto Lfe
            java.lang.Class<java.io.File> r0 = java.io.File.class
            m2.h<?> r2 = r1.f17816Z
            java.lang.Class<Transcode> r2 = r2.f17656k
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld7
            return r3
        Ld7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to find any load path from "
            java.lang.StringBuilder r2 = android.support.v4.media.C0144c.m256a(r2)
            m2.h<?> r3 = r1.f17816Z
            java.lang.Object r3 = r3.f17649d
            java.lang.Class r3 = r3.getClass()
            r2.append(r3)
            java.lang.String r3 = " to "
            r2.append(r3)
            m2.h<?> r3 = r1.f17816Z
            java.lang.Class<Transcode> r3 = r3.f17656k
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        Lfe:
            java.util.List<q2.m<java.io.File, ?>> r2 = r1.f17820d0
            if (r2 == 0) goto L164
            int r4 = r1.f17821e0
            int r2 = r2.size()
            if (r4 >= r2) goto L10c
            r2 = 1
            goto L10d
        L10c:
            r2 = 0
        L10d:
            if (r2 != 0) goto L110
            goto L164
        L110:
            r1.f17822f0 = r9
            r0 = 0
        L113:
            if (r0 != 0) goto L163
            int r2 = r1.f17821e0
            java.util.List<q2.m<java.io.File, ?>> r3 = r1.f17820d0
            int r3 = r3.size()
            if (r2 >= r3) goto L121
            r2 = 1
            goto L122
        L121:
            r2 = 0
        L122:
            if (r2 == 0) goto L163
            java.util.List<q2.m<java.io.File, ?>> r2 = r1.f17820d0
            int r3 = r1.f17821e0
            int r4 = r3 + 1
            r1.f17821e0 = r4
            java.lang.Object r2 = r2.get(r3)
            q2.m r2 = (p282q2.InterfaceC5556m) r2
            java.io.File r3 = r1.f17823g0
            m2.h<?> r4 = r1.f17816Z
            int r5 = r4.f17650e
            int r6 = r4.f17651f
            k2.e r4 = r4.f17654i
            q2.m$a r2 = r2.mo9582a(r3, r5, r6, r4)
            r1.f17822f0 = r2
            q2.m$a<?> r2 = r1.f17822f0
            if (r2 == 0) goto L113
            m2.h<?> r2 = r1.f17816Z
            q2.m$a<?> r3 = r1.f17822f0
            com.bumptech.glide.load.data.d<Data> r3 = r3.f21626c
            java.lang.Class r3 = r3.mo2786a()
            boolean r2 = r2.m9665g(r3)
            if (r2 == 0) goto L113
            q2.m$a<?> r0 = r1.f17822f0
            com.bumptech.glide.load.data.d<Data> r0 = r0.f21626c
            m2.h<?> r2 = r1.f17816Z
            com.bumptech.glide.g r2 = r2.f17660o
            r0.mo2793f(r2, r1)
            r0 = 1
            goto L113
        L163:
            return r0
        L164:
            int r2 = r1.f17818b0
            int r2 = r2 + 1
            r1.f17818b0 = r2
            int r4 = r11.size()
            if (r2 < r4) goto L17f
            int r2 = r1.f17817a0
            int r2 = r2 + 1
            r1.f17817a0 = r2
            int r4 = r0.size()
            if (r2 < r4) goto L17d
            return r3
        L17d:
            r1.f17818b0 = r3
        L17f:
            int r2 = r1.f17817a0
            java.lang.Object r2 = r0.get(r2)
            k2.c r2 = (p180k2.InterfaceC3671c) r2
            int r4 = r1.f17818b0
            java.lang.Object r4 = r11.get(r4)
            java.lang.Class r4 = (java.lang.Class) r4
            m2.h<?> r5 = r1.f17816Z
            k2.h r18 = r5.m9664f(r4)
            m2.y r5 = new m2.y
            m2.h<?> r6 = r1.f17816Z
            com.bumptech.glide.e r7 = r6.f17648c
            n2.b r13 = r7.f5123a
            k2.c r15 = r6.f17659n
            int r7 = r6.f17650e
            int r8 = r6.f17651f
            k2.e r10 = r6.f17654i
            r12 = r5
            r14 = r2
            r16 = r7
            r17 = r8
            r19 = r4
            r20 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.f17824h0 = r5
            o2.a r4 = r6.m9660b()
            m2.y r5 = r1.f17824h0
            java.io.File r4 = r4.mo11024a(r5)
            r1.f17823g0 = r4
            if (r4 == 0) goto Lfe
            r1.f17819c0 = r2
            m2.h<?> r2 = r1.f17816Z
            com.bumptech.glide.e r2 = r2.f17648c
            com.bumptech.glide.h r2 = r2.f5124b
            java.util.List r2 = r2.m2744f(r4)
            r1.f17820d0 = r2
            r1.f17821e0 = r3
            goto Lfe
        L1d4:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d4
            throw r0
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1016d.a
    /* renamed from: c */
    public void mo2794c(java.lang.Exception r5) {
            r4 = this;
            m2.g$a r0 = r4.f17815Y
            m2.y r1 = r4.f17824h0
            q2.m$a<?> r2 = r4.f17822f0
            com.bumptech.glide.load.data.d<Data> r2 = r2.f21626c
            com.bumptech.glide.load.a r3 = com.bumptech.glide.load.EnumC1008a.f5183b0
            r0.mo9657g(r1, r5, r2, r3)
            return
    }

    @Override // p214m2.InterfaceC4329g
    public void cancel() {
            r1 = this;
            q2.m$a<?> r0 = r1.f17822f0
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
            m2.g$a r0 = r6.f17815Y
            k2.c r1 = r6.f17819c0
            q2.m$a<?> r2 = r6.f17822f0
            com.bumptech.glide.load.data.d<Data> r3 = r2.f21626c
            com.bumptech.glide.load.a r4 = com.bumptech.glide.load.EnumC1008a.f5183b0
            m2.y r5 = r6.f17824h0
            r2 = r7
            r0.mo9658h(r1, r2, r3, r4, r5)
            return
    }
}
