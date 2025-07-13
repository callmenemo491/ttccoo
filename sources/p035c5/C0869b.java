package p035c5;

/* renamed from: c5.b */
/* loaded from: classes.dex */
public final class C0869b implements p427y4.C7110a.b {
    public static final android.os.Parcelable.Creator<p035c5.C0869b> CREATOR = null;

    /* renamed from: Y */
    public final int f4703Y;

    /* renamed from: Z */
    public final java.lang.String f4704Z;

    /* renamed from: a0 */
    public final java.lang.String f4705a0;

    /* renamed from: b0 */
    public final java.lang.String f4706b0;

    /* renamed from: c0 */
    public final boolean f4707c0;

    /* renamed from: d0 */
    public final int f4708d0;

    /* renamed from: c5.b$a */
    public class a implements android.os.Parcelable.Creator<p035c5.C0869b> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p035c5.C0869b createFromParcel(android.os.Parcel r2) {
                r1 = this;
                c5.b r0 = new c5.b
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p035c5.C0869b[] newArray(int r1) {
                r0 = this;
                c5.b[] r1 = new p035c5.C0869b[r1]
                return r1
        }
    }

    static {
            c5.b$a r0 = new c5.b$a
            r0.<init>()
            p035c5.C0869b.CREATOR = r0
            return
    }

    public C0869b(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6, int r7) {
            r1 = this;
            r1.<init>()
            r0 = -1
            if (r7 == r0) goto Lb
            if (r7 <= 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            p371v5.C6549a.m13288b(r0)
            r1.f4703Y = r2
            r1.f4704Z = r3
            r1.f4705a0 = r4
            r1.f4706b0 = r5
            r1.f4707c0 = r6
            r1.f4708d0 = r7
            return
    }

    public C0869b(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            int r0 = r2.readInt()
            r1.f4703Y = r0
            java.lang.String r0 = r2.readString()
            r1.f4704Z = r0
            java.lang.String r0 = r2.readString()
            r1.f4705a0 = r0
            java.lang.String r0 = r2.readString()
            r1.f4706b0 = r0
            int r0 = p371v5.C6552b0.f25624a
            int r0 = r2.readInt()
            if (r0 == 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r1.f4707c0 = r0
            int r2 = r2.readInt()
            r1.f4708d0 = r2
            return
    }

    /* renamed from: a */
    public static p035c5.C0869b m2591a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
            java.lang.String r0 = "Invalid metadata interval: "
            java.lang.String r1 = "icy-br"
            java.lang.Object r1 = r13.get(r1)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r2 = "IcyHeaders"
            r3 = -1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r1.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            int r6 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L41
            int r6 = r6 * 1000
            if (r6 <= 0) goto L21
            r1 = 1
            goto L3d
        L21:
            java.lang.String r7 = "Invalid bitrate: "
            java.lang.String r8 = java.lang.String.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L3f
            int r9 = r8.length()     // Catch: java.lang.NumberFormatException -> L3f
            if (r9 == 0) goto L32
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.NumberFormatException -> L3f
            goto L38
        L32:
            java.lang.String r8 = new java.lang.String     // Catch: java.lang.NumberFormatException -> L3f
            r8.<init>(r7)     // Catch: java.lang.NumberFormatException -> L3f
            r7 = r8
        L38:
            android.util.Log.w(r2, r7)     // Catch: java.lang.NumberFormatException -> L3f
            r1 = 0
            r6 = -1
        L3d:
            r7 = r6
            goto L60
        L3f:
            goto L42
        L41:
            r6 = -1
        L42:
            java.lang.String r7 = "Invalid bitrate header: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r8 = r1.length()
            if (r8 == 0) goto L53
            java.lang.String r1 = r7.concat(r1)
            goto L58
        L53:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r7)
        L58:
            android.util.Log.w(r2, r1)
            r7 = r6
            r1 = 0
            goto L60
        L5e:
            r1 = 0
            r7 = -1
        L60:
            java.lang.String r6 = "icy-genre"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            r8 = 0
            if (r6 == 0) goto L74
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r9 = r1
            r1 = 1
            goto L75
        L74:
            r9 = r8
        L75:
            java.lang.String r6 = "icy-name"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L88
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r10 = r1
            r1 = 1
            goto L89
        L88:
            r10 = r8
        L89:
            java.lang.String r6 = "icy-url"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L9c
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            r1 = 1
            goto L9d
        L9c:
            r11 = r8
        L9d:
            java.lang.String r6 = "icy-pub"
            java.lang.Object r6 = r13.get(r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto Lb6
            java.lang.Object r1 = r6.get(r5)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r6 = "1"
            boolean r1 = r1.equals(r6)
            r12 = r1
            r1 = 1
            goto Lb7
        Lb6:
            r12 = 0
        Lb7:
            java.lang.String r6 = "icy-metaint"
            java.lang.Object r13 = r13.get(r6)
            java.util.List r13 = (java.util.List) r13
            if (r13 == 0) goto L103
            java.lang.Object r13 = r13.get(r5)
            java.lang.String r13 = (java.lang.String) r13
            int r5 = java.lang.Integer.parseInt(r13)     // Catch: java.lang.NumberFormatException -> Leb
            if (r5 <= 0) goto Lcf
            r3 = r5
            goto Le7
        Lcf:
            java.lang.String r4 = java.lang.String.valueOf(r13)     // Catch: java.lang.NumberFormatException -> Le9
            int r6 = r4.length()     // Catch: java.lang.NumberFormatException -> Le9
            if (r6 == 0) goto Lde
            java.lang.String r4 = r0.concat(r4)     // Catch: java.lang.NumberFormatException -> Le9
            goto Le3
        Lde:
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.NumberFormatException -> Le9
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> Le9
        Le3:
            android.util.Log.w(r2, r4)     // Catch: java.lang.NumberFormatException -> Le9
            r4 = r1
        Le7:
            r1 = r4
            goto L103
        Le9:
            r3 = r5
            goto Lec
        Leb:
        Lec:
            java.lang.String r13 = java.lang.String.valueOf(r13)
            int r4 = r13.length()
            if (r4 == 0) goto Lfb
            java.lang.String r13 = r0.concat(r13)
            goto L100
        Lfb:
            java.lang.String r13 = new java.lang.String
            r13.<init>(r0)
        L100:
            android.util.Log.w(r2, r13)
        L103:
            if (r1 == 0) goto L111
            c5.b r13 = new c5.b
            r6 = r13
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r8 = r13
        L111:
            return r8
    }

    @Override // p427y4.C7110a.b
    /* renamed from: D */
    public /* synthetic */ p088f4.C2003e0 mo30D() {
            r1 = this;
            f4.e0 r0 = p427y4.C7111b.m14222b(r1)
            return r0
    }

    @Override // p427y4.C7110a.b
    /* renamed from: O */
    public /* synthetic */ byte[] mo31O() {
            r1 = this;
            byte[] r0 = p427y4.C7111b.m14221a(r1)
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L45
            java.lang.Class<c5.b> r2 = p035c5.C0869b.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L45
        L10:
            c5.b r5 = (p035c5.C0869b) r5
            int r2 = r4.f4703Y
            int r3 = r5.f4703Y
            if (r2 != r3) goto L43
            java.lang.String r2 = r4.f4704Z
            java.lang.String r3 = r5.f4704Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.f4705a0
            java.lang.String r3 = r5.f4705a0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L43
            java.lang.String r2 = r4.f4706b0
            java.lang.String r3 = r5.f4706b0
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L43
            boolean r2 = r4.f4707c0
            boolean r3 = r5.f4707c0
            if (r2 != r3) goto L43
            int r2 = r4.f4708d0
            int r5 = r5.f4708d0
            if (r2 != r5) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            return r0
        L45:
            return r1
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.f4703Y
            r1 = 527(0x20f, float:7.38E-43)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.f4704Z
            r2 = 0
            if (r0 == 0) goto L11
            int r0 = r0.hashCode()
            goto L12
        L11:
            r0 = 0
        L12:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.f4705a0
            if (r0 == 0) goto L1e
            int r0 = r0.hashCode()
            goto L1f
        L1e:
            r0 = 0
        L1f:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.f4706b0
            if (r0 == 0) goto L2a
            int r2 = r0.hashCode()
        L2a:
            int r1 = r1 + r2
            int r1 = r1 * 31
            boolean r0 = r3.f4707c0
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r0 = r3.f4708d0
            int r1 = r1 + r0
            return r1
    }

    @Override // p427y4.C7110a.b
    /* renamed from: p */
    public void mo32p(p088f4.C2021k0.b r2) {
            r1 = this;
            java.lang.String r0 = r1.f4705a0
            if (r0 == 0) goto L6
            r2.f9133E = r0
        L6:
            java.lang.String r0 = r1.f4704Z
            if (r0 == 0) goto Lc
            r2.f9131C = r0
        Lc:
            return
    }

    public java.lang.String toString() {
            r7 = this;
            java.lang.String r0 = r7.f4705a0
            java.lang.String r1 = r7.f4704Z
            int r2 = r7.f4703Y
            int r3 = r7.f4708d0
            r4 = 80
            int r4 = p064e.C1489c.m4038a(r0, r4)
            int r4 = p064e.C1489c.m4038a(r1, r4)
            java.lang.String r5 = "IcyHeaders: name=\""
            java.lang.String r6 = "\", genre=\""
            java.lang.StringBuilder r0 = p064e.C1491e.m4040a(r4, r5, r0, r6, r1)
            java.lang.String r1 = "\", bitrate="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", metadataInterval="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r3 = r1.f4703Y
            r2.writeInt(r3)
            java.lang.String r3 = r1.f4704Z
            r2.writeString(r3)
            java.lang.String r3 = r1.f4705a0
            r2.writeString(r3)
            java.lang.String r3 = r1.f4706b0
            r2.writeString(r3)
            boolean r3 = r1.f4707c0
            int r0 = p371v5.C6552b0.f25624a
            r2.writeInt(r3)
            int r3 = r1.f4708d0
            r2.writeInt(r3)
            return
    }
}
