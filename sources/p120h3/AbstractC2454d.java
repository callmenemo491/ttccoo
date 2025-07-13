package p120h3;

/* renamed from: h3.d */
/* loaded from: classes.dex */
public abstract class AbstractC2454d {

    /* renamed from: h3.d$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: h3.d$b */
    public static class b extends p120h3.AbstractC2454d {

        /* renamed from: a */
        public volatile boolean f10953a;

        public b() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        @Override // p120h3.AbstractC2454d
        /* renamed from: a */
        public void mo6233a() {
                r2 = this;
                boolean r0 = r2.f10953a
                if (r0 != 0) goto L5
                return
            L5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Already released"
                r0.<init>(r1)
                throw r0
        }
    }

    public AbstractC2454d(p120h3.AbstractC2454d.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public abstract void mo6233a();
}
