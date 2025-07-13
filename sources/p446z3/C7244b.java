package p446z3;

/* renamed from: z3.b */
/* loaded from: classes.dex */
public class C7244b implements p446z3.InterfaceC7245c {

    /* renamed from: f */
    public static final java.util.logging.Logger f27841f = null;

    /* renamed from: a */
    public final p005a4.InterfaceC0023l f27842a;

    /* renamed from: b */
    public final java.util.concurrent.Executor f27843b;

    /* renamed from: c */
    public final p405x3.InterfaceC6922d f27844c;

    /* renamed from: d */
    public final p021b4.InterfaceC0666c f27845d;

    /* renamed from: e */
    public final p034c4.InterfaceC0867b f27846e;

    static {
            java.lang.Class<w3.m> r0 = p385w3.C6791m.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            p446z3.C7244b.f27841f = r0
            return
    }

    public C7244b(java.util.concurrent.Executor r1, p405x3.InterfaceC6922d r2, p005a4.InterfaceC0023l r3, p021b4.InterfaceC0666c r4, p034c4.InterfaceC0867b r5) {
            r0 = this;
            r0.<init>()
            r0.f27843b = r1
            r0.f27844c = r2
            r0.f27842a = r3
            r0.f27845d = r4
            r0.f27846e = r5
            return
    }

    @Override // p446z3.InterfaceC7245c
    /* renamed from: a */
    public void mo14314a(p385w3.AbstractC6787i r3, p385w3.AbstractC6784f r4, p335t3.InterfaceC6155h r5) {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.f27843b
            g5.s r1 = new g5.s
            r1.<init>(r2, r3, r5, r4)
            r0.execute(r1)
            return
    }
}
