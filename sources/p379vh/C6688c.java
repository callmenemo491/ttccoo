package p379vh;

/* renamed from: vh.c */
/* loaded from: classes.dex */
public final class C6688c<T> {

    /* renamed from: b */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f25959b = null;

    /* renamed from: a */
    public final kotlinx.coroutines.Deferred<T>[] f25960a;
    public volatile /* synthetic */ int notCompletedCount;

    /* renamed from: vh.c$a */
    public final class a extends p379vh.AbstractC6699f1 {
        private volatile /* synthetic */ java.lang.Object _disposer;

        /* renamed from: c0 */
        public final p379vh.InterfaceC6703h<java.util.List<? extends T>> f25961c0;

        /* renamed from: d0 */
        public p379vh.InterfaceC6719m0 f25962d0;

        /* renamed from: e0 */
        public final /* synthetic */ p379vh.C6688c<T> f25963e0;

        public a(p379vh.C6688c r1, p379vh.InterfaceC6703h<? super java.util.List<? extends T>> r2) {
                r0 = this;
                r0.f25963e0 = r1
                r0.<init>()
                r0.f25961c0 = r2
                r1 = 0
                r0._disposer = r1
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public /* bridge */ /* synthetic */ ch.C0985l mo107b(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.mo13549q(r1)
                ch.l r1 = ch.C0985l.f5061a
                return r1
        }

        @Override // p379vh.AbstractC6745v
        /* renamed from: q */
        public void mo13549q(java.lang.Throwable r6) {
                r5 = this;
                if (r6 == 0) goto L1a
                vh.h<java.util.List<? extends T>> r0 = r5.f25961c0
                java.lang.Object r6 = r0.mo13613q(r6)
                if (r6 == 0) goto L43
                vh.h<java.util.List<? extends T>> r0 = r5.f25961c0
                r0.mo13614r(r6)
                java.lang.Object r6 = r5._disposer
                vh.c$b r6 = (p379vh.C6688c.b) r6
                if (r6 != 0) goto L16
                goto L43
            L16:
                r6.m13560c()
                goto L43
            L1a:
                vh.c<T> r6 = r5.f25963e0
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = p379vh.C6688c.f25959b
                int r6 = r0.decrementAndGet(r6)
                if (r6 != 0) goto L43
                vh.h<java.util.List<? extends T>> r6 = r5.f25961c0
                vh.c<T> r0 = r5.f25963e0
                kotlinx.coroutines.Deferred<T>[] r0 = r0.f25960a
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.length
                r1.<init>(r2)
                int r2 = r0.length
                r3 = 0
            L32:
                if (r3 >= r2) goto L40
                r4 = r0[r3]
                java.lang.Object r4 = r4.mo13567h()
                r1.add(r4)
                int r3 = r3 + 1
                goto L32
            L40:
                r6.mo5707k(r1)
            L43:
                return
        }

        /* renamed from: s */
        public final void m13558s(p379vh.C6688c<T>.b r1) {
                r0 = this;
                r0._disposer = r1
                return
        }
    }

    /* renamed from: vh.c$b */
    public final class b extends p379vh.AbstractC6697f {

        /* renamed from: Y */
        public final kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] f25964Y;

        public b(p379vh.C6688c r1, kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] r2) {
                r0 = this;
                r0.<init>()
                r0.f25964Y = r2
                return
        }

        @Override // p379vh.AbstractC6700g
        /* renamed from: a */
        public void mo13559a(java.lang.Throwable r1) {
                r0 = this;
                r0.m13560c()
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.m13560c()
                ch.l r1 = ch.C0985l.f5061a
                return r1
        }

        /* renamed from: c */
        public final void m13560c() {
                r4 = this;
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r0 = r4.f25964Y
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L19
                r3 = r0[r2]
                vh.m0 r3 = r3.f25962d0
                if (r3 == 0) goto L12
                r3.mo13570h()
                int r2 = r2 + 1
                goto L4
            L12:
                java.lang.String r0 = "handle"
                p214m2.C4339q.m9713w(r0)
                r0 = 0
                throw r0
            L19:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.String r0 = "DisposeHandlersOnCancel["
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                kotlinx.coroutines.AwaitAll<T>$AwaitAllNode[] r1 = r2.f25964Y
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<vh.c> r0 = p379vh.C6688c.class
            java.lang.String r1 = "notCompletedCount"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            p379vh.C6688c.f25959b = r0
            return
    }

    public C6688c(kotlinx.coroutines.Deferred<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.f25960a = r1
            int r1 = r1.length
            r0.notCompletedCount = r1
            return
    }
}
