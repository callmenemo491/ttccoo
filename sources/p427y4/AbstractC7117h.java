package p427y4;

/* renamed from: y4.h */
/* loaded from: classes.dex */
public abstract class AbstractC7117h implements p427y4.InterfaceC7112c {
    public AbstractC7117h() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p427y4.InterfaceC7112c
    /* renamed from: a */
    public final p427y4.C7110a mo14224a(p427y4.C7114e r3) {
            r2 = this;
            java.nio.ByteBuffer r0 = r3.f12358a0
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.position()
            if (r1 != 0) goto L19
            boolean r1 = r0.hasArray()
            if (r1 == 0) goto L19
            int r1 = r0.arrayOffset()
            if (r1 != 0) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            p371v5.C6549a.m13288b(r1)
            boolean r1 = r3.m7516q()
            if (r1 == 0) goto L25
            r3 = 0
            goto L29
        L25:
            y4.a r3 = r2.mo33b(r3, r0)
        L29:
            return r3
    }

    /* renamed from: b */
    public abstract p427y4.C7110a mo33b(p427y4.C7114e r1, java.nio.ByteBuffer r2);
}
