package p179k1;

/* renamed from: k1.h */
/* loaded from: classes.dex */
public final class C3650h implements p243o1.InterfaceC4873c, p179k1.InterfaceC3656n {

    /* renamed from: Y */
    public final p243o1.InterfaceC4873c f16137Y;

    /* renamed from: Z */
    public final p179k1.C3650h.a f16138Z;

    /* renamed from: k1.h$a */
    public static final class a implements p243o1.InterfaceC4871a {
    }

    /* renamed from: k1.h$b */
    public static class b implements p243o1.InterfaceC4876f {

        /* renamed from: Y */
        public final java.lang.String f16139Y;

        /* renamed from: Z */
        public final java.util.ArrayList<java.lang.Object> f16140Z;
    }

    @Override // p179k1.InterfaceC3656n
    /* renamed from: a */
    public p243o1.InterfaceC4873c mo8082a() {
            r1 = this;
            o1.c r0 = r1.f16137Y
            return r0
    }

    @Override // p243o1.InterfaceC4873c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 0
            throw r0     // Catch: java.io.IOException -> L2
        L2:
            r0 = move-exception
            throw r0
    }

    @Override // p243o1.InterfaceC4873c
    public java.lang.String getDatabaseName() {
            r1 = this;
            o1.c r0 = r1.f16137Y
            java.lang.String r0 = r0.getDatabaseName()
            return r0
    }

    @Override // p243o1.InterfaceC4873c
    /* renamed from: o0 */
    public p243o1.InterfaceC4871a mo8083o0() {
            r1 = this;
            k1.h$a r0 = r1.f16138Z
            java.util.Objects.requireNonNull(r0)
            r0 = 0
            throw r0
    }

    @Override // p243o1.InterfaceC4873c
    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            o1.c r0 = r1.f16137Y
            r0.setWriteAheadLoggingEnabled(r2)
            return
    }
}
