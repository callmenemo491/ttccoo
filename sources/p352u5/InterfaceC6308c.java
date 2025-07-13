package p352u5;

/* renamed from: u5.c */
/* loaded from: classes.dex */
public interface InterfaceC6308c {

    /* renamed from: u5.c$a */
    public interface a {

        /* renamed from: u5.c$a$a, reason: collision with other inner class name */
        public static final class C7424a {

            /* renamed from: a */
            public final java.util.concurrent.CopyOnWriteArrayList<p352u5.InterfaceC6308c.a.C7424a.C7425a> f24628a;

            /* renamed from: u5.c$a$a$a, reason: collision with other inner class name */
            public static final class C7425a {

                /* renamed from: a */
                public final android.os.Handler f24629a;

                /* renamed from: b */
                public final p352u5.InterfaceC6308c.a f24630b;

                /* renamed from: c */
                public boolean f24631c;

                public C7425a(android.os.Handler r1, p352u5.InterfaceC6308c.a r2) {
                        r0 = this;
                        r0.<init>()
                        r0.f24629a = r1
                        r0.f24630b = r2
                        return
                }
            }

            public C7424a() {
                    r1 = this;
                    r1.<init>()
                    java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
                    r0.<init>()
                    r1.f24628a = r0
                    return
            }

            /* renamed from: a */
            public void m12947a(p352u5.InterfaceC6308c.a r4) {
                    r3 = this;
                    java.util.concurrent.CopyOnWriteArrayList<u5.c$a$a$a> r0 = r3.f24628a
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L1f
                    java.lang.Object r1 = r0.next()
                    u5.c$a$a$a r1 = (p352u5.InterfaceC6308c.a.C7424a.C7425a) r1
                    u5.c$a r2 = r1.f24630b
                    if (r2 != r4) goto L6
                    r2 = 1
                    r1.f24631c = r2
                    java.util.concurrent.CopyOnWriteArrayList<u5.c$a$a$a> r2 = r3.f24628a
                    r2.remove(r1)
                    goto L6
                L1f:
                    return
            }
        }
    }

    /* renamed from: b */
    p352u5.InterfaceC6317g0 mo12944b();

    /* renamed from: e */
    void mo12945e(android.os.Handler r1, p352u5.InterfaceC6308c.a r2);

    /* renamed from: g */
    void mo12946g(p352u5.InterfaceC6308c.a r1);
}
