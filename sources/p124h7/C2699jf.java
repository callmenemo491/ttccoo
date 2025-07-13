package p124h7;

/* renamed from: h7.jf */
/* loaded from: classes.dex */
public final class C2699jf implements android.os.Parcelable.Creator<p124h7.C2681if> {
    public C2699jf() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2681if createFromParcel(android.os.Parcel r22) {
            r21 = this;
            r0 = r22
            int r1 = p270p6.C5368b.m11710t(r22)
            r2 = 0
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r15 = r12
            r16 = r15
            r17 = r16
            r18 = r17
            r20 = r18
            r13 = 0
            r14 = 0
            r19 = 0
        L1d:
            int r2 = r22.dataPosition()
            if (r2 >= r1) goto L97
            int r2 = r22.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L91;
                case 3: goto L8b;
                case 4: goto L85;
                case 5: goto L7f;
                case 6: goto L79;
                case 7: goto L73;
                case 8: goto L6d;
                case 9: goto L67;
                case 10: goto L61;
                case 11: goto L5b;
                case 12: goto L55;
                case 13: goto L4e;
                case 14: goto L47;
                case 15: goto L40;
                case 16: goto L39;
                case 17: goto L32;
                default: goto L2e;
            }
        L2e:
            p270p6.C5368b.m11709s(r0, r2)
            goto L1d
        L32:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r20 = r2
            goto L1d
        L39:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r19 = r2
            goto L1d
        L40:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r18 = r2
            goto L1d
        L47:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r17 = r2
            goto L1d
        L4e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r16 = r2
            goto L1d
        L55:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r15 = r2
            goto L1d
        L5b:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r14 = r2
            goto L1d
        L61:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r13 = r2
            goto L1d
        L67:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r12 = r2
            goto L1d
        L6d:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r11 = r2
            goto L1d
        L73:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r10 = r2
            goto L1d
        L79:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r9 = r2
            goto L1d
        L7f:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r8 = r2
            goto L1d
        L85:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L1d
        L8b:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r6 = r2
            goto L1d
        L91:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r5 = r2
            goto L1d
        L97:
            p270p6.C5368b.m11699i(r0, r1)
            h7.if r0 = new h7.if
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2681if[] newArray(int r1) {
            r0 = this;
            h7.if[] r1 = new p124h7.C2681if[r1]
            return r1
    }
}
