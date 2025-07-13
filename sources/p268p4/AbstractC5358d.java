package p268p4;

/* renamed from: p4.d */
/* loaded from: classes.dex */
public abstract class AbstractC5358d {

    /* renamed from: a */
    public final p216m4.InterfaceC4381z f21287a;

    /* renamed from: p4.d$a */
    public static final class a extends p088f4.C2044s0 {
        public a(java.lang.String r4) {
                r3 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                r3.<init>(r4, r0, r1, r2)
                return
        }
    }

    public AbstractC5358d(p216m4.InterfaceC4381z r1) {
            r0 = this;
            r0.<init>()
            r0.f21287a = r1
            return
    }

    /* renamed from: a */
    public final boolean m11666a(p371v5.C6571u r2, long r3) {
            r1 = this;
            boolean r0 = r1.mo11659b(r2)
            if (r0 == 0) goto Le
            boolean r2 = r1.mo11660c(r2, r3)
            if (r2 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    /* renamed from: b */
    public abstract boolean mo11659b(p371v5.C6571u r1);

    /* renamed from: c */
    public abstract boolean mo11660c(p371v5.C6571u r1, long r2);
}
