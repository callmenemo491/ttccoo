package p221m9;

/* renamed from: m9.a0 */
/* loaded from: classes.dex */
public class C4434a0 extends java.io.IOException {

    /* renamed from: m9.a0$a */
    public static class a extends p221m9.C4434a0 {
        public a(java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    public C4434a0(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: a */
    public static p221m9.C4434a0 m9895a() {
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = "Protocol message end-group tag did not match expected tag."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: b */
    public static p221m9.C4434a0 m9896b() {
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = "Protocol message contained an invalid tag (zero)."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: c */
    public static p221m9.C4434a0 m9897c() {
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = "Protocol message had invalid UTF-8."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: d */
    public static p221m9.C4434a0.a m9898d() {
            m9.a0$a r0 = new m9.a0$a
            java.lang.String r1 = "Protocol message tag had invalid wire type."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: e */
    public static p221m9.C4434a0 m9899e() {
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = "CodedInputStream encountered a malformed varint."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: f */
    public static p221m9.C4434a0 m9900f() {
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: g */
    public static p221m9.C4434a0 m9901g() {
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = "Failed to parse the message."
            r0.<init>(r1)
            return r0
    }

    /* renamed from: h */
    public static p221m9.C4434a0 m9902h() {
            m9.a0 r0 = new m9.a0
            java.lang.String r1 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r0.<init>(r1)
            return r0
    }
}
