package p323s3;

/* renamed from: s3.b */
/* loaded from: classes.dex */
public class C5948b extends p323s3.C5950d.a {

    /* renamed from: d */
    public static p323s3.C5950d<p323s3.C5948b> f22834d;

    /* renamed from: b */
    public double f22835b;

    /* renamed from: c */
    public double f22836c;

    static {
            s3.b r0 = new s3.b
            r1 = 0
            r0.<init>(r1, r1)
            r1 = 64
            s3.d r0 = p323s3.C5950d.m12361a(r1, r0)
            p323s3.C5948b.f22834d = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r0.m12365e(r1)
            return
    }

    public C5948b(double r1, double r3) {
            r0 = this;
            r0.<init>()
            r0.f22835b = r1
            r0.f22836c = r3
            return
    }

    /* renamed from: b */
    public static p323s3.C5948b m12358b(double r1, double r3) {
            s3.d<s3.b> r0 = p323s3.C5948b.f22834d
            s3.d$a r0 = r0.m12362b()
            s3.b r0 = (p323s3.C5948b) r0
            r0.f22835b = r1
            r0.f22836c = r3
            return r0
    }

    @Override // p323s3.C5950d.a
    /* renamed from: a */
    public p323s3.C5950d.a mo12357a() {
            r3 = this;
            s3.b r0 = new s3.b
            r1 = 0
            r0.<init>(r1, r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "MPPointD, x: "
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            double r1 = r3.f22835b
            r0.append(r1)
            java.lang.String r1 = ", y: "
            r0.append(r1)
            double r1 = r3.f22836c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
