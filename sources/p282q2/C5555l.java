package p282q2;

/* renamed from: q2.l */
/* loaded from: classes.dex */
public class C5555l<A, B> {

    /* renamed from: a */
    public final p106g3.C2235g<p282q2.C5555l.b<A>, B> f21619a;

    /* renamed from: q2.l$a */
    public class a extends p106g3.C2235g<p282q2.C5555l.b<A>, B> {
        public a(p282q2.C5555l r1, long r2) {
                r0 = this;
                r0.<init>(r2)
                return
        }

        @Override // p106g3.C2235g
        /* renamed from: c */
        public void mo5836c(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                q2.l$b r1 = (p282q2.C5555l.b) r1
                r1.m11838b()
                return
        }
    }

    /* renamed from: q2.l$b */
    public static final class b<A> {

        /* renamed from: d */
        public static final java.util.Queue<p282q2.C5555l.b<?>> f21620d = null;

        /* renamed from: a */
        public int f21621a;

        /* renamed from: b */
        public int f21622b;

        /* renamed from: c */
        public A f21623c;

        static {
                char[] r0 = p106g3.C2238j.f10214a
                java.util.ArrayDeque r0 = new java.util.ArrayDeque
                r1 = 0
                r0.<init>(r1)
                p282q2.C5555l.b.f21620d = r0
                return
        }

        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: a */
        public static <A> p282q2.C5555l.b<A> m11837a(A r2, int r3, int r4) {
                java.util.Queue<q2.l$b<?>> r0 = p282q2.C5555l.b.f21620d
                monitor-enter(r0)
                r1 = r0
                java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L1d
                q2.l$b r1 = (p282q2.C5555l.b) r1     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                if (r1 != 0) goto L14
                q2.l$b r1 = new q2.l$b
                r1.<init>()
            L14:
                r1.f21623c = r2
                r1.f21622b = r3
                r1.f21621a = r4
                return r1
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
                throw r2
            L1d:
                r2 = move-exception
                goto L1b
        }

        /* renamed from: b */
        public void m11838b() {
                r2 = this;
                java.util.Queue<q2.l$b<?>> r0 = p282q2.C5555l.b.f21620d
                monitor-enter(r0)
                r1 = r0
                java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch: java.lang.Throwable -> Ld
                r1.offer(r2)     // Catch: java.lang.Throwable -> Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                return
            Lb:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
                throw r1
            Ld:
                r1 = move-exception
                goto Lb
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof p282q2.C5555l.b
                r1 = 0
                if (r0 == 0) goto L1e
                q2.l$b r4 = (p282q2.C5555l.b) r4
                int r0 = r3.f21622b
                int r2 = r4.f21622b
                if (r0 != r2) goto L1e
                int r0 = r3.f21621a
                int r2 = r4.f21621a
                if (r0 != r2) goto L1e
                A r0 = r3.f21623c
                A r4 = r4.f21623c
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1e
                r1 = 1
            L1e:
                return r1
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.f21621a
                int r0 = r0 * 31
                int r1 = r2.f21622b
                int r0 = r0 + r1
                int r0 = r0 * 31
                A r1 = r2.f21623c
                int r1 = r1.hashCode()
                int r1 = r1 + r0
                return r1
        }
    }

    public C5555l(long r2) {
            r1 = this;
            r1.<init>()
            q2.l$a r0 = new q2.l$a
            r0.<init>(r1, r2)
            r1.f21619a = r0
            return
    }
}
