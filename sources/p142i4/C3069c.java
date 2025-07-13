package p142i4;

/* renamed from: i4.c */
/* loaded from: classes.dex */
public final class C3069c {

    /* renamed from: a */
    public byte[] f12334a;

    /* renamed from: b */
    public byte[] f12335b;

    /* renamed from: c */
    public int f12336c;

    /* renamed from: d */
    public int[] f12337d;

    /* renamed from: e */
    public int[] f12338e;

    /* renamed from: f */
    public int f12339f;

    /* renamed from: g */
    public int f12340g;

    /* renamed from: h */
    public int f12341h;

    /* renamed from: i */
    public final android.media.MediaCodec.CryptoInfo f12342i;

    /* renamed from: j */
    public final p142i4.C3069c.b f12343j;

    /* renamed from: i4.c$a */
    public static /* synthetic */ class a {
    }

    /* renamed from: i4.c$b */
    public static final class b {

        /* renamed from: a */
        public final android.media.MediaCodec.CryptoInfo f12344a;

        /* renamed from: b */
        public final android.media.MediaCodec.CryptoInfo.Pattern f12345b;

        public b(android.media.MediaCodec.CryptoInfo r1, p142i4.C3069c.a r2) {
                r0 = this;
                r0.<init>()
                r0.f12344a = r1
                android.media.MediaCodec$CryptoInfo$Pattern r1 = new android.media.MediaCodec$CryptoInfo$Pattern
                r2 = 0
                r1.<init>(r2, r2)
                r0.f12345b = r1
                return
        }
    }

    public C3069c() {
            r4 = this;
            r4.<init>()
            android.media.MediaCodec$CryptoInfo r0 = new android.media.MediaCodec$CryptoInfo
            r0.<init>()
            r4.f12342i = r0
            int r1 = p371v5.C6552b0.f25624a
            r2 = 0
            r3 = 24
            if (r1 < r3) goto L17
            i4.c$b r1 = new i4.c$b
            r1.<init>(r0, r2)
            r2 = r1
        L17:
            r4.f12343j = r2
            return
    }
}
