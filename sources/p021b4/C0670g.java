package p021b4;

/* renamed from: b4.g */
/* loaded from: classes.dex */
public final class C0670g implements bh.InterfaceC0769a {

    /* renamed from: b4.g$a */
    public static final class a {

        /* renamed from: a */
        public static final p021b4.C0670g f3837a = null;

        static {
                b4.g r0 = new b4.g
                r0.<init>()
                p021b4.C0670g.a.f3837a = r0
                return
        }
    }

    public C0670g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // bh.InterfaceC0769a
    public java.lang.Object get() {
            r2 = this;
            b4.d r0 = p021b4.AbstractC0667d.f3834a
            java.lang.String r1 = "Cannot return null from a non-@Nullable @Provides method"
            java.util.Objects.requireNonNull(r0, r1)
            return r0
    }
}
