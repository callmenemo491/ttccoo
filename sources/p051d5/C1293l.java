package p051d5;

/* renamed from: d5.l */
/* loaded from: classes.dex */
public final class C1293l extends p051d5.AbstractC1289h {
    public static final android.os.Parcelable.Creator<p051d5.C1293l> CREATOR = null;

    /* renamed from: Z */
    public final java.lang.String f6801Z;

    /* renamed from: a0 */
    public final java.lang.String f6802a0;

    /* renamed from: d5.l$a */
    public class a implements android.os.Parcelable.Creator<p051d5.C1293l> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1293l createFromParcel(android.os.Parcel r2) {
                r1 = this;
                d5.l r0 = new d5.l
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.Parcelable.Creator
        public p051d5.C1293l[] newArray(int r1) {
                r0 = this;
                d5.l[] r1 = new p051d5.C1293l[r1]
                return r1
        }
    }

    static {
            d5.l$a r0 = new d5.l$a
            r0.<init>()
            p051d5.C1293l.CREATOR = r0
            return
    }

    public C1293l(android.os.Parcel r3) {
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = p371v5.C6552b0.f25624a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f6801Z = r0
            java.lang.String r3 = r3.readString()
            r2.f6802a0 = r3
            return
    }

    public C1293l(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f6801Z = r2
            r0.f6802a0 = r3
            return
    }

    /* renamed from: a */
    public static java.util.List<java.lang.Integer> m3760a(java.lang.String r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L6f
            r2 = 5
            r3 = 10
            r4 = 7
            r5 = 0
            r6 = 4
            if (r1 < r3) goto L41
            java.lang.String r1 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L6f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L6f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L6f
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L6f
            java.lang.String r1 = r7.substring(r2, r4)     // Catch: java.lang.NumberFormatException -> L6f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L6f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L6f
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L6f
            r1 = 8
            java.lang.String r7 = r7.substring(r1, r3)     // Catch: java.lang.NumberFormatException -> L6f
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L6f
        L39:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NumberFormatException -> L6f
            r0.add(r7)     // Catch: java.lang.NumberFormatException -> L6f
            goto L6e
        L41:
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L6f
            if (r1 < r4) goto L5f
            java.lang.String r1 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L6f
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L6f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L6f
            r0.add(r1)     // Catch: java.lang.NumberFormatException -> L6f
            java.lang.String r7 = r7.substring(r2, r4)     // Catch: java.lang.NumberFormatException -> L6f
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L6f
            goto L39
        L5f:
            int r1 = r7.length()     // Catch: java.lang.NumberFormatException -> L6f
            if (r1 < r6) goto L6e
            java.lang.String r7 = r7.substring(r5, r6)     // Catch: java.lang.NumberFormatException -> L6f
            int r7 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L6f
            goto L39
        L6e:
            return r0
        L6f:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            return r7
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L33
            java.lang.Class<d5.l> r2 = p051d5.C1293l.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L33
        L10:
            d5.l r5 = (p051d5.C1293l) r5
            java.lang.String r2 = r4.f6790Y
            java.lang.String r3 = r5.f6790Y
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.f6801Z
            java.lang.String r3 = r5.f6801Z
            boolean r2 = p371v5.C6552b0.m13308a(r2, r3)
            if (r2 == 0) goto L31
            java.lang.String r2 = r4.f6802a0
            java.lang.String r5 = r5.f6802a0
            boolean r5 = p371v5.C6552b0.m13308a(r2, r5)
            if (r5 == 0) goto L31
            goto L32
        L31:
            r0 = 0
        L32:
            return r0
        L33:
            return r1
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6790Y
            r1 = 527(0x20f, float:7.38E-43)
            r2 = 31
            int r0 = p213m1.C4319e.m9651a(r0, r1, r2)
            java.lang.String r1 = r3.f6801Z
            r2 = 0
            if (r1 == 0) goto L14
            int r1 = r1.hashCode()
            goto L15
        L14:
            r1 = 0
        L15:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.f6802a0
            if (r1 == 0) goto L20
            int r2 = r1.hashCode()
        L20:
            int r0 = r0 + r2
            return r0
    }

    @Override // p051d5.AbstractC1289h, p427y4.C7110a.b
    /* renamed from: p */
    public void mo32p(p088f4.C2021k0.b r9) {
            r8 = this;
            java.lang.String r0 = r8.f6790Y
            java.util.Objects.requireNonNull(r0)
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 2
            r4 = 0
            r5 = 3
            r6 = 4
            r7 = -1
            switch(r1) {
                case 82815: goto L125;
                case 82878: goto L11a;
                case 82897: goto L10f;
                case 83253: goto L104;
                case 83254: goto Lf9;
                case 83255: goto Lee;
                case 83341: goto Le3;
                case 83378: goto Ld8;
                case 83536: goto Lca;
                case 83552: goto Lbc;
                case 2567331: goto Lae;
                case 2569357: goto La0;
                case 2569891: goto L92;
                case 2570401: goto L84;
                case 2570410: goto L76;
                case 2571565: goto L68;
                case 2575251: goto L5a;
                case 2581512: goto L4c;
                case 2581513: goto L3e;
                case 2581514: goto L30;
                case 2583398: goto L22;
                case 2590194: goto L14;
                default: goto L12;
            }
        L12:
            goto L12f
        L14:
            java.lang.String r1 = "TYER"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            goto L12f
        L1e:
            r7 = 21
            goto L12f
        L22:
            java.lang.String r1 = "TRCK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L12f
        L2c:
            r7 = 20
            goto L12f
        L30:
            java.lang.String r1 = "TPE3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3a
            goto L12f
        L3a:
            r7 = 19
            goto L12f
        L3e:
            java.lang.String r1 = "TPE2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            goto L12f
        L48:
            r7 = 18
            goto L12f
        L4c:
            java.lang.String r1 = "TPE1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L56
            goto L12f
        L56:
            r7 = 17
            goto L12f
        L5a:
            java.lang.String r1 = "TIT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L64
            goto L12f
        L64:
            r7 = 16
            goto L12f
        L68:
            java.lang.String r1 = "TEXT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L72
            goto L12f
        L72:
            r7 = 15
            goto L12f
        L76:
            java.lang.String r1 = "TDRL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80
            goto L12f
        L80:
            r7 = 14
            goto L12f
        L84:
            java.lang.String r1 = "TDRC"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8e
            goto L12f
        L8e:
            r7 = 13
            goto L12f
        L92:
            java.lang.String r1 = "TDAT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9c
            goto L12f
        L9c:
            r7 = 12
            goto L12f
        La0:
            java.lang.String r1 = "TCOM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Laa
            goto L12f
        Laa:
            r7 = 11
            goto L12f
        Lae:
            java.lang.String r1 = "TALB"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lb8
            goto L12f
        Lb8:
            r7 = 10
            goto L12f
        Lbc:
            java.lang.String r1 = "TYE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lc6
            goto L12f
        Lc6:
            r7 = 9
            goto L12f
        Lca:
            java.lang.String r1 = "TXT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Ld4
            goto L12f
        Ld4:
            r7 = 8
            goto L12f
        Ld8:
            java.lang.String r1 = "TT2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Le1
            goto L12f
        Le1:
            r7 = 7
            goto L12f
        Le3:
            java.lang.String r1 = "TRK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lec
            goto L12f
        Lec:
            r7 = 6
            goto L12f
        Lee:
            java.lang.String r1 = "TP3"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lf7
            goto L12f
        Lf7:
            r7 = 5
            goto L12f
        Lf9:
            java.lang.String r1 = "TP2"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L102
            goto L12f
        L102:
            r7 = 4
            goto L12f
        L104:
            java.lang.String r1 = "TP1"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L10d
            goto L12f
        L10d:
            r7 = 3
            goto L12f
        L10f:
            java.lang.String r1 = "TDA"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L118
            goto L12f
        L118:
            r7 = 2
            goto L12f
        L11a:
            java.lang.String r1 = "TCM"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L123
            goto L12f
        L123:
            r7 = 1
            goto L12f
        L125:
            java.lang.String r1 = "TAL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L12e
            goto L12f
        L12e:
            r7 = 0
        L12f:
            switch(r7) {
                case 0: goto L202;
                case 1: goto L1fd;
                case 2: goto L1dc;
                case 3: goto L1d7;
                case 4: goto L1d2;
                case 5: goto L1cd;
                case 6: goto L1a7;
                case 7: goto L1a2;
                case 8: goto L19d;
                case 9: goto L190;
                case 10: goto L202;
                case 11: goto L1fd;
                case 12: goto L1dc;
                case 13: goto L162;
                case 14: goto L134;
                case 15: goto L19d;
                case 16: goto L1a2;
                case 17: goto L1d7;
                case 18: goto L1d2;
                case 19: goto L1cd;
                case 20: goto L1a7;
                case 21: goto L190;
                default: goto L132;
            }
        L132:
            goto L206
        L134:
            java.lang.String r0 = r8.f6802a0
            java.util.List r0 = m3760a(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r1 == r2) goto L158
            if (r1 == r3) goto L150
            if (r1 == r5) goto L148
            goto L206
        L148:
            java.lang.Object r1 = r0.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.f9157w = r1
        L150:
            java.lang.Object r1 = r0.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.f9156v = r1
        L158:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.f9155u = r0
            goto L206
        L162:
            java.lang.String r0 = r8.f6802a0
            java.util.List r0 = m3760a(r0)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r1 == r2) goto L186
            if (r1 == r3) goto L17e
            if (r1 == r5) goto L176
            goto L206
        L176:
            java.lang.Object r1 = r0.get(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.f9154t = r1
        L17e:
            java.lang.Object r1 = r0.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r9.f9153s = r1
        L186:
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r9.f9152r = r0
            goto L206
        L190:
            java.lang.String r0 = r8.f6802a0     // Catch: java.lang.Throwable -> L206
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L206
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L206
            r9.f9152r = r0     // Catch: java.lang.Throwable -> L206
            goto L206
        L19d:
            java.lang.String r0 = r8.f6802a0
            r9.f9158x = r0
            goto L206
        L1a2:
            java.lang.String r0 = r8.f6802a0
            r9.f9135a = r0
            goto L206
        L1a7:
            java.lang.String r0 = r8.f6802a0
            java.lang.String r1 = "/"
            java.lang.String[] r0 = p371v5.C6552b0.m13303G(r0, r1)
            r1 = r0[r4]     // Catch: java.lang.Throwable -> L206
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L206
            int r3 = r0.length     // Catch: java.lang.Throwable -> L206
            if (r3 <= r2) goto L1c3
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L206
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L206
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L206
            goto L1c4
        L1c3:
            r0 = 0
        L1c4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L206
            r9.f9148n = r1     // Catch: java.lang.Throwable -> L206
            r9.f9149o = r0     // Catch: java.lang.Throwable -> L206
            goto L206
        L1cd:
            java.lang.String r0 = r8.f6802a0
            r9.f9160z = r0
            goto L206
        L1d2:
            java.lang.String r0 = r8.f6802a0
            r9.f9138d = r0
            goto L206
        L1d7:
            java.lang.String r0 = r8.f6802a0
            r9.f9136b = r0
            goto L206
        L1dc:
            java.lang.String r0 = r8.f6802a0     // Catch: java.lang.Throwable -> L206
            java.lang.String r0 = r0.substring(r3, r6)     // Catch: java.lang.Throwable -> L206
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L206
            java.lang.String r1 = r8.f6802a0     // Catch: java.lang.Throwable -> L206
            java.lang.String r1 = r1.substring(r4, r3)     // Catch: java.lang.Throwable -> L206
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L206
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L206
            r9.f9153s = r0     // Catch: java.lang.Throwable -> L206
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L206
            r9.f9154t = r0     // Catch: java.lang.Throwable -> L206
            goto L206
        L1fd:
            java.lang.String r0 = r8.f6802a0
            r9.f9159y = r0
            goto L206
        L202:
            java.lang.String r0 = r8.f6802a0
            r9.f9137c = r0
        L206:
            return
    }

    @Override // p051d5.AbstractC1289h
    public java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.f6790Y
            java.lang.String r1 = r6.f6801Z
            java.lang.String r2 = r6.f6802a0
            r3 = 22
            int r3 = p064e.C1489c.m4038a(r0, r3)
            int r3 = p064e.C1489c.m4038a(r1, r3)
            int r3 = p064e.C1489c.m4038a(r2, r3)
            java.lang.String r4 = ": description="
            java.lang.String r5 = ": value="
            java.lang.StringBuilder r0 = p064e.C1491e.m4040a(r3, r0, r4, r1, r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            java.lang.String r2 = r0.f6790Y
            r1.writeString(r2)
            java.lang.String r2 = r0.f6801Z
            r1.writeString(r2)
            java.lang.String r2 = r0.f6802a0
            r1.writeString(r2)
            return
    }
}
