package p351u4;

/* renamed from: u4.h */
/* loaded from: classes.dex */
public abstract class AbstractC6302h {

    /* renamed from: a */
    public final p351u4.C6298d f24595a;

    /* renamed from: b */
    public p216m4.InterfaceC4381z f24596b;

    /* renamed from: c */
    public p216m4.InterfaceC4366k f24597c;

    /* renamed from: d */
    public p351u4.InterfaceC6300f f24598d;

    /* renamed from: e */
    public long f24599e;

    /* renamed from: f */
    public long f24600f;

    /* renamed from: g */
    public long f24601g;

    /* renamed from: h */
    public int f24602h;

    /* renamed from: i */
    public int f24603i;

    /* renamed from: j */
    public p351u4.AbstractC6302h.b f24604j;

    /* renamed from: k */
    public long f24605k;

    /* renamed from: l */
    public boolean f24606l;

    /* renamed from: m */
    public boolean f24607m;

    /* renamed from: u4.h$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: u4.h$b */
    public static class b {

        /* renamed from: a */
        public p088f4.C2003e0 f24608a;

        /* renamed from: b */
        public p351u4.InterfaceC6300f f24609b;

        public b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* renamed from: u4.h$c */
    public static final class c implements p351u4.InterfaceC6300f {
        public c(p351u4.AbstractC6302h.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // p351u4.InterfaceC6300f
        /* renamed from: a */
        public p216m4.InterfaceC4378w mo12930a() {
                r5 = this;
                m4.w$b r0 = new m4.w$b
                r1 = 0
                r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                r0.<init>(r3, r1)
                return r0
        }

        @Override // p351u4.InterfaceC6300f
        /* renamed from: b */
        public void mo12931b(long r1) {
                r0 = this;
                return
        }

        @Override // p351u4.InterfaceC6300f
        /* renamed from: c */
        public long mo12932c(p216m4.InterfaceC4365j r3) {
                r2 = this;
                r0 = -1
                return r0
        }
    }

    public AbstractC6302h() {
            r1 = this;
            r1.<init>()
            u4.d r0 = new u4.d
            r0.<init>()
            r1.f24595a = r0
            u4.h$b r0 = new u4.h$b
            r0.<init>()
            r1.f24604j = r0
            return
    }

    /* renamed from: a */
    public long m12942a(long r3) {
            r2 = this;
            int r0 = r2.f24603i
            long r0 = (long) r0
            long r0 = r0 * r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r3
            return r0
    }

    /* renamed from: b */
    public void mo12943b(long r1) {
            r0 = this;
            r0.f24601g = r1
            return
    }

    /* renamed from: c */
    public abstract long mo12933c(p371v5.C6571u r1);

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: d */
    public abstract boolean mo12934d(p371v5.C6571u r1, long r2, p351u4.AbstractC6302h.b r4);

    /* renamed from: e */
    public void mo12935e(boolean r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Lf
            u4.h$b r5 = new u4.h$b
            r5.<init>()
            r4.f24604j = r5
            r4.f24600f = r0
            r5 = 0
            goto L10
        Lf:
            r5 = 1
        L10:
            r4.f24602h = r5
            r2 = -1
            r4.f24599e = r2
            r4.f24601g = r0
            return
    }
}
