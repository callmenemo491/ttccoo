package p221m9;

/* renamed from: m9.z */
/* loaded from: classes.dex */
public final class C4505z {

    /* renamed from: a */
    public static final java.nio.charset.Charset f18308a = null;

    /* renamed from: b */
    public static final byte[] f18309b = null;

    /* renamed from: m9.z$a */
    public interface a {
        /* renamed from: d */
        int mo9432d();
    }

    /* renamed from: m9.z$b */
    public interface b {
        /* renamed from: a */
        boolean m10388a(int r1);
    }

    /* renamed from: m9.z$c */
    public interface c<E> extends java.util.List<E>, java.util.RandomAccess {
        /* renamed from: B */
        p221m9.C4505z.c<E> mo9905B(int r1);

        /* renamed from: U */
        boolean mo9908U();

        /* renamed from: v */
        void mo9910v();
    }

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            p221m9.C4505z.f18308a = r0
            java.lang.String r0 = "ISO-8859-1"
            java.nio.charset.Charset.forName(r0)
            r0 = 0
            byte[] r1 = new byte[r0]
            p221m9.C4505z.f18309b = r1
            java.nio.ByteBuffer.wrap(r1)
            int r2 = r1.length
            p221m9.AbstractC4457i.m10074f(r1, r0, r2, r0)
            return
    }

    /* renamed from: a */
    public static int m10385a(boolean r0) {
            if (r0 == 0) goto L5
            r0 = 1231(0x4cf, float:1.725E-42)
            goto L7
        L5:
            r0 = 1237(0x4d5, float:1.733E-42)
        L7:
            return r0
    }

    /* renamed from: b */
    public static int m10386b(long r2) {
            r0 = 32
            long r0 = r2 >>> r0
            long r2 = r2 ^ r0
            int r3 = (int) r2
            return r3
    }

    /* renamed from: c */
    public static java.lang.Object m10387c(java.lang.Object r1, java.lang.Object r2) {
            m9.q0 r1 = (p221m9.InterfaceC4482q0) r1
            m9.q0$a r1 = r1.mo10234c()
            m9.q0 r2 = (p221m9.InterfaceC4482q0) r2
            m9.a$a r1 = (p221m9.AbstractC4433a.a) r1
            java.util.Objects.requireNonNull(r1)
            m9.x$a r1 = (p221m9.AbstractC4501x.a) r1
            MessageType extends m9.x<MessageType, BuilderType> r0 = r1.f18292Y
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L2c
            m9.a r2 = (p221m9.AbstractC4433a) r2
            m9.x r2 = (p221m9.AbstractC4501x) r2
            r1.m10377o()
            MessageType extends m9.x<MessageType, BuilderType> r0 = r1.f18293Z
            r1.m10379q(r0, r2)
            m9.x r1 = r1.m10376m()
            return r1
        L2c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "mergeFrom(MessageLite) can only merge messages of the same type."
            r1.<init>(r2)
            throw r1
    }
}
