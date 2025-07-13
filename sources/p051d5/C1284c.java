package p051d5;

/* renamed from: d5.c */
/* loaded from: classes.dex */
public final class C1284c extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1284c> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6767Z;

    /* renamed from: a0 */
    public final int f6768a0;

    /* renamed from: b0 */
    public final int f6769b0;

    /* renamed from: c0 */
    public final long f6770c0;

    /* renamed from: d0 */
    public final long f6771d0;

    /* renamed from: e0 */
    public final p051d5.AbstractC1289h[] f6772e0;

    /* renamed from: d5.c$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1284c> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1284c createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.c r0 = new d5.c
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1284c[] newArray(int r1) {
                r0 = this;
                d5.c[] r1 = new p051d5.C1284c[r1]
                return r1
        }
    }

    static {
            d5.c$a r0 = new d5.c$a
            r0.<init>()
            p051d5.C1284c.CREATOR = r0
            return
    }

    public C1284c(android.os.Parcel r5) {
            r4 = this;
            java.lang.String r0 = "CHAP"
            r4.<init>(r0)
            java.lang.String r0 = r5.readString()
            int r1 = p371v5.C6552b0.f25624a
            r4.f6767Z = r0
            int r0 = r5.readInt()
            r4.f6768a0 = r0
            int r0 = r5.readInt()
            r4.f6769b0 = r0
            long r0 = r5.readLong()
            r4.f6770c0 = r0
            long r0 = r5.readLong()
            r4.f6771d0 = r0
            int r0 = r5.readInt()
            d5.h[] r1 = new p051d5.AbstractC1289h[r0]
            r4.f6772e0 = r1
            r1 = 0
        L2e:
            if (r1 >= r0) goto L43
            d5.h[] r2 = r4.f6772e0
            java.lang.Class<d5.h> r3 = p051d5.AbstractC1289h.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            android.os.Parcelable r3 = r5.readParcelable(r3)
            d5.h r3 = (p051d5.AbstractC1289h) r3
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2e
        L43:
            return
    }

    public C1284c(java.lang.String r2, int r3, int r4, long r5, long r7, p051d5.AbstractC1289h[] r9) {
            r1 = this;
            java.lang.String r0 = "CHAP"
            r1.<init>(r0)
            r1.f6767Z = r2
            r1.f6768a0 = r3
            r1.f6769b0 = r4
            r1.f6770c0 = r5
            r1.f6771d0 = r7
            r1.f6772e0 = r9
            return
    }

    @Override // p051d5.AbstractC1289h, android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            if (r8 == 0) goto L45
            java.lang.Class<d5.c> r2 = p051d5.C1284c.class
            java.lang.Class r3 = r8.getClass()
            if (r2 == r3) goto L10
            goto L45
        L10:
            d5.c r8 = (p051d5.C1284c) r8
            int r2 = r7.f6768a0
            int r3 = r8.f6768a0
            if (r2 != r3) goto L43
            int r2 = r7.f6769b0
            int r3 = r8.f6769b0
            if (r2 != r3) goto L43
            long r2 = r7.f6770c0
            long r4 = r8.f6770c0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            long r2 = r7.f6771d0
            long r4 = r8.f6771d0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L43
            java.lang.String r2 = r7.f6767Z
            java.lang.String r3 = r8.f6767Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L43
            d5.h[] r2 = r7.f6772e0
            d5.h[] r8 = r8.f6772e0
            boolean r8 = java.util.Arrays.equals(r2, r8)
            if (r8 == 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
            return r1
    }

    public int hashCode() {
            r4 = this;
            int r0 = r4.f6768a0
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r4.f6769b0
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f6770c0
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            long r2 = r4.f6771d0
            int r0 = (int) r2
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r4.f6767Z
            if (r0 == 0) goto L21
            int r0 = r0.hashCode()
            goto L22
        L21:
            r0 = 0
        L22:
            int r1 = r1 + r0
            return r1
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r6 = r4.f6767Z
            r5.writeString(r6)
            int r6 = r4.f6768a0
            r5.writeInt(r6)
            int r6 = r4.f6769b0
            r5.writeInt(r6)
            long r0 = r4.f6770c0
            r5.writeLong(r0)
            long r0 = r4.f6771d0
            r5.writeLong(r0)
            d5.h[] r6 = r4.f6772e0
            int r6 = r6.length
            r5.writeInt(r6)
            d5.h[] r6 = r4.f6772e0
            int r0 = r6.length
            r1 = 0
            r2 = 0
        L24:
            if (r2 >= r0) goto L2e
            r3 = r6[r2]
            r5.writeParcelable(r3, r1)
            int r2 = r2 + 1
            goto L24
        L2e:
            return
    }
}
