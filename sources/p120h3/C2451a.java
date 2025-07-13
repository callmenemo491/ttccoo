package p120h3;

/* renamed from: h3.a */
/* loaded from: classes.dex */
public final class C2451a {

    /* renamed from: a */
    public static final p120h3.C2451a.e<java.lang.Object> f10949a = null;

    /* renamed from: h3.a$a */
    public class a implements p120h3.C2451a.e<java.lang.Object> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p120h3.C2451a.e
        /* renamed from: a */
        public void mo6228a(java.lang.Object r1) {
                r0 = this;
                return
        }
    }

    /* renamed from: h3.a$b */
    public interface b<T> {
        /* renamed from: a */
        T mo6229a();
    }

    /* renamed from: h3.a$c */
    public static final class c<T> implements p212m0.InterfaceC4313c<T> {

        /* renamed from: a */
        public final p120h3.C2451a.b<T> f10950a;

        /* renamed from: b */
        public final p120h3.C2451a.e<T> f10951b;

        /* renamed from: c */
        public final p212m0.InterfaceC4313c<T> f10952c;

        public c(p212m0.InterfaceC4313c<T> r1, p120h3.C2451a.b<T> r2, p120h3.C2451a.e<T> r3) {
                r0 = this;
                r0.<init>()
                r0.f10952c = r1
                r0.f10950a = r2
                r0.f10951b = r3
                return
        }

        @Override // p212m0.InterfaceC4313c
        /* renamed from: a */
        public boolean mo6230a(T r3) {
                r2 = this;
                boolean r0 = r3 instanceof p120h3.C2451a.d
                if (r0 == 0) goto L10
                r0 = r3
                h3.a$d r0 = (p120h3.C2451a.d) r0
                h3.d r0 = r0.mo6232k()
                r1 = 1
                h3.d$b r0 = (p120h3.AbstractC2454d.b) r0
                r0.f10953a = r1
            L10:
                h3.a$e<T> r0 = r2.f10951b
                r0.mo6228a(r3)
                m0.c<T> r0 = r2.f10952c
                boolean r3 = r0.mo6230a(r3)
                return r3
        }

        @Override // p212m0.InterfaceC4313c
        /* renamed from: b */
        public T mo6231b() {
                r4 = this;
                m0.c<T> r0 = r4.f10952c
                java.lang.Object r0 = r0.mo6231b()
                if (r0 != 0) goto L2b
                h3.a$b<T> r0 = r4.f10950a
                java.lang.Object r0 = r0.mo6229a()
                r1 = 2
                java.lang.String r2 = "FactoryPools"
                boolean r1 = android.util.Log.isLoggable(r2, r1)
                if (r1 == 0) goto L2b
                java.lang.String r1 = "Created new "
                java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
                java.lang.Class r3 = r0.getClass()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.v(r2, r1)
            L2b:
                boolean r1 = r0 instanceof p120h3.C2451a.d
                if (r1 == 0) goto L3b
                r1 = r0
                h3.a$d r1 = (p120h3.C2451a.d) r1
                h3.d r1 = r1.mo6232k()
                r2 = 0
                h3.d$b r1 = (p120h3.AbstractC2454d.b) r1
                r1.f10953a = r2
            L3b:
                return r0
        }
    }

    /* renamed from: h3.a$d */
    public interface d {
        /* renamed from: k */
        p120h3.AbstractC2454d mo6232k();
    }

    /* renamed from: h3.a$e */
    public interface e<T> {
        /* renamed from: a */
        void mo6228a(T r1);
    }

    static {
            h3.a$a r0 = new h3.a$a
            r0.<init>()
            p120h3.C2451a.f10949a = r0
            return
    }

    /* renamed from: a */
    public static <T extends p120h3.C2451a.d> p212m0.InterfaceC4313c<T> m6227a(int r2, p120h3.C2451a.b<T> r3) {
            m0.d r0 = new m0.d
            r0.<init>(r2)
            h3.a$e<java.lang.Object> r2 = p120h3.C2451a.f10949a
            h3.a$c r1 = new h3.a$c
            r1.<init>(r0, r3, r2)
            return r1
    }
}
