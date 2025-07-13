package p089f5;

/* renamed from: f5.g */
/* loaded from: classes.dex */
public final class C2065g extends p089f5.AbstractC2060b {
    public static final android.os.Parcelable.Creator<p089f5.C2065g> CREATOR = null;

    /* renamed from: Y */
    public final long f9464Y;

    /* renamed from: Z */
    public final long f9465Z;

    /* renamed from: f5.g$a */
    public class a implements android.os.Parcelable.Creator<p089f5.C2065g> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2065g createFromParcel(android.os.Parcel r8) {
                r7 = this;
                f5.g r6 = new f5.g
                long r1 = r8.readLong()
                long r3 = r8.readLong()
                r5 = 0
                r0 = r6
                r0.<init>(r1, r3, r5)
                return r6
        }

        @Override // android.os.Parcelable.Creator
        public p089f5.C2065g[] newArray(int r1) {
                r0 = this;
                f5.g[] r1 = new p089f5.C2065g[r1]
                return r1
        }
    }

    static {
            f5.g$a r0 = new f5.g$a
            r0.<init>()
            p089f5.C2065g.CREATOR = r0
            return
    }

    public C2065g(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f9464Y = r1
            r0.f9465Z = r3
            return
    }

    public C2065g(long r1, long r3, p089f5.C2065g.a r5) {
            r0 = this;
            r0.<init>()
            r0.f9464Y = r1
            r0.f9465Z = r3
            return
    }

    /* renamed from: a */
    public static long m5488a(p371v5.C6571u r7, long r8) {
            int r0 = r7.m13418u()
            long r0 = (long) r0
            r2 = 128(0x80, double:6.3E-322)
            long r2 = r2 & r0
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L21
            r2 = 1
            long r0 = r0 & r2
            r2 = 32
            long r0 = r0 << r2
            long r2 = r7.m13419v()
            long r0 = r0 | r2
            long r0 = r0 + r8
            r7 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r7 = r7 & r0
            goto L26
        L21:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L26:
            return r7
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            long r0 = r2.f9464Y
            r3.writeLong(r0)
            long r0 = r2.f9465Z
            r3.writeLong(r0)
            return
    }
}
