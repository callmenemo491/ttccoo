package p124h7;

/* renamed from: h7.f */
/* loaded from: classes.dex */
public class C2611f extends java.io.IOException {

    /* renamed from: Y */
    public static final /* synthetic */ int f11503Y = 0;

    public C2611f(java.io.IOException r2) {
            r1 = this;
            java.lang.String r0 = r2.getMessage()
            r1.<init>(r0, r2)
            return
    }

    public C2611f(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: a */
    public static p124h7.C2611f m6681a() {
            h7.f r0 = new h7.f
            java.lang.String r1 = "Protocol message end-group tag did not match expected tag."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: b */
    public static p124h7.C2611f m6682b() {
            h7.f r0 = new h7.f
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: c */
    public static p124h7.C2611f m6683c() {
            h7.f r0 = new h7.f
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: d */
    public static p124h7.C2611f m6684d() {
            h7.f r0 = new h7.f
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: e */
    public static p124h7.C2611f m6685e() {
            h7.f r0 = new h7.f
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: f */
    public static p124h7.C2611f m6686f() {
            h7.f r0 = new h7.f
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: g */
    public static p124h7.C2611f m6687g() {
            h7.f r0 = new h7.f
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }
}
