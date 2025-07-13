package p121h4;

/* renamed from: h4.f */
/* loaded from: classes.dex */
public interface InterfaceC2465f {

    /* renamed from: a */
    public static final java.nio.ByteBuffer f11036a = null;

    /* renamed from: h4.f$a */
    public static final class a {

        /* renamed from: e */
        public static final p121h4.InterfaceC2465f.a f11037e = null;

        /* renamed from: a */
        public final int f11038a;

        /* renamed from: b */
        public final int f11039b;

        /* renamed from: c */
        public final int f11040c;

        /* renamed from: d */
        public final int f11041d;

        static {
                h4.f$a r0 = new h4.f$a
                r1 = -1
                r0.<init>(r1, r1, r1)
                p121h4.InterfaceC2465f.a.f11037e = r0
                return
        }

        public a(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.f11038a = r1
                r0.f11039b = r2
                r0.f11040c = r3
                boolean r1 = p371v5.C6552b0.m13332y(r3)
                if (r1 == 0) goto L14
                int r1 = p371v5.C6552b0.m13326s(r3, r2)
                goto L15
            L14:
                r1 = -1
            L15:
                r0.f11041d = r1
                return
        }

        public java.lang.String toString() {
                r5 = this;
                int r0 = r5.f11038a
                int r1 = r5.f11039b
                int r2 = r5.f11040c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r4 = 83
                r3.<init>(r4)
                java.lang.String r4 = "AudioFormat[sampleRate="
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = ", channelCount="
                r3.append(r0)
                r3.append(r1)
                java.lang.String r0 = ", encoding="
                r3.append(r0)
                r3.append(r2)
                r0 = 93
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                return r0
        }
    }

    /* renamed from: h4.f$b */
    public static final class b extends java.lang.Exception {
        public b(p121h4.InterfaceC2465f.a r3) {
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                int r0 = r0 + 18
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Unhandled format: "
                r1.append(r0)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
        }
    }

    static {
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            p121h4.InterfaceC2465f.f11036a = r0
            return
    }

    /* renamed from: a */
    boolean mo6240a();

    /* renamed from: b */
    void mo6257b();

    /* renamed from: c */
    java.nio.ByteBuffer mo6258c();

    /* renamed from: d */
    boolean mo6259d();

    /* renamed from: e */
    void mo6260e();

    /* renamed from: f */
    p121h4.InterfaceC2465f.a mo6261f(p121h4.InterfaceC2465f.a r1);

    void flush();

    /* renamed from: g */
    void mo6237g(java.nio.ByteBuffer r1);
}
