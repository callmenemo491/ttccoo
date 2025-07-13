package vg;

/* renamed from: vg.f */
/* loaded from: classes.dex */
public final class C6665f {

    /* renamed from: vg.f$a */
    public static final class a<TResult> implements p327s7.InterfaceC5980d {

        /* renamed from: a */
        public final /* synthetic */ p327s7.AbstractC5985i<T> f25909a;

        /* renamed from: b */
        public final /* synthetic */ p379vh.InterfaceC6703h<T> f25910b;

        /* renamed from: vg.f$a$a, reason: collision with other inner class name */
        public static final class C7427a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Throwable, ch.C0985l> {

            /* renamed from: Z */
            public static final vg.C6665f.a.C7427a f25911Z = null;

            static {
                    vg.f$a$a r0 = new vg.f$a$a
                    r0.<init>()
                    vg.C6665f.a.C7427a.f25911Z = r0
                    return
            }

            public C7427a() {
                    r1 = this;
                    r0 = 1
                    r1.<init>(r0)
                    return
            }

            @Override // mh.InterfaceC4620l
            /* renamed from: b */
            public ch.C0985l mo107b(java.lang.Throwable r2) {
                    r1 = this;
                    java.lang.Throwable r2 = (java.lang.Throwable) r2
                    java.lang.String r0 = "it"
                    p214m2.C4339q.m9706k(r2, r0)
                    ch.l r2 = ch.C0985l.f5061a
                    return r2
            }
        }

        public a(p327s7.AbstractC5985i<T> r1, p379vh.InterfaceC6703h<? super T> r2) {
                r0 = this;
                r0.f25909a = r1
                r0.f25910b = r2
                r0.<init>()
                return
        }

        @Override // p327s7.InterfaceC5980d
        /* renamed from: a */
        public final void mo3092a(p327s7.AbstractC5985i<T> r3) {
                r2 = this;
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r3, r0)
                s7.i<T> r3 = r2.f25909a
                java.lang.Exception r3 = r3.mo12450h()
                if (r3 != 0) goto L2a
                s7.i<T> r3 = r2.f25909a
                boolean r3 = r3.mo12453k()
                if (r3 == 0) goto L1c
                vh.h<T> r3 = r2.f25910b
                r0 = 0
                r3.mo13611m(r0)
                goto L33
            L1c:
                vh.h<T> r3 = r2.f25910b
                s7.i<T> r0 = r2.f25909a
                java.lang.Object r0 = r0.mo12451i()
                vg.f$a$a r1 = vg.C6665f.a.C7427a.f25911Z
                r3.mo13610f(r0, r1)
                goto L33
            L2a:
                vh.h<T> r0 = r2.f25910b
                java.lang.Object r3 = p074e9.C1805a.m4520e(r3)
                r0.mo5707k(r3)
            L33:
                return
        }
    }

    /* renamed from: a */
    public static final <T> java.lang.Object m13513a(p327s7.AbstractC5985i<T> r2, p101fh.InterfaceC2172d<? super T> r3) {
            boolean r0 = r2.mo12454l()
            if (r0 == 0) goto L34
            java.lang.Exception r3 = r2.mo12450h()
            if (r3 != 0) goto L33
            boolean r3 = r2.mo12453k()
            if (r3 != 0) goto L17
            java.lang.Object r2 = r2.mo12451i()
            return r2
        L17:
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Task "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " was cancelled normally."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L33:
            throw r3
        L34:
            vh.i r0 = new vh.i
            fh.d r3 = gh.C2390b.m6127q(r3)
            r1 = 1
            r0.<init>(r3, r1)
            r0.m13634x()
            vg.f$a r3 = new vg.f$a
            r3.<init>(r2, r0)
            r2.mo12444b(r3)
            java.lang.Object r2 = r0.m13633w()
            return r2
    }
}
