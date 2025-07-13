package p282q2;

/* renamed from: q2.m */
/* loaded from: classes.dex */
public interface InterfaceC5556m<Model, Data> {

    /* renamed from: q2.m$a */
    public static class a<Data> {

        /* renamed from: a */
        public final p180k2.InterfaceC3671c f21624a;

        /* renamed from: b */
        public final java.util.List<p180k2.InterfaceC3671c> f21625b;

        /* renamed from: c */
        public final com.bumptech.glide.load.data.InterfaceC1016d<Data> f21626c;

        public a(p180k2.InterfaceC3671c r3, com.bumptech.glide.load.data.InterfaceC1016d<Data> r4) {
                r2 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r2.<init>()
                java.lang.String r1 = "Argument must not be null"
                java.util.Objects.requireNonNull(r3, r1)
                r2.f21624a = r3
                java.util.Objects.requireNonNull(r0, r1)
                r2.f21625b = r0
                java.util.Objects.requireNonNull(r4, r1)
                r2.f21626c = r4
                return
        }
    }

    /* renamed from: a */
    p282q2.InterfaceC5556m.a<Data> mo9582a(Model r1, int r2, int r3, p180k2.C3673e r4);

    /* renamed from: b */
    boolean mo9583b(Model r1);
}
