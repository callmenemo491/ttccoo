package p036c6;

/* renamed from: c6.t0 */
/* loaded from: classes.dex */
public final class C0912t0 implements android.os.Parcelable.Creator<p036c6.C0903p> {
    public C0912t0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0903p createFromParcel(android.os.Parcel r36) {
            r35 = this;
            r0 = r36
            int r1 = p270p6.C5368b.m11710t(r36)
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r13 = r2
            r21 = r13
            r10 = r4
            r17 = r10
            r19 = r17
            r9 = r7
            r24 = r9
            r27 = r24
            r29 = r27
            r31 = r29
            r32 = r31
            r33 = r32
            r34 = r33
            r12 = 0
            r15 = 0
            r16 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r30 = 0
        L31:
            int r2 = r36.dataPosition()
            if (r2 >= r1) goto Lf3
            int r2 = r36.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto Le8;
                case 3: goto Le1;
                case 4: goto Lda;
                case 5: goto Ld3;
                case 6: goto Lcc;
                case 7: goto Lc4;
                case 8: goto Lbc;
                case 9: goto Lb4;
                case 10: goto Lac;
                case 11: goto La5;
                case 12: goto L9e;
                case 13: goto L97;
                case 14: goto L90;
                case 15: goto L89;
                case 16: goto L82;
                case 17: goto L79;
                case 18: goto L72;
                case 19: goto L67;
                case 20: goto L5c;
                case 21: goto L51;
                case 22: goto L46;
                default: goto L42;
            }
        L42:
            p270p6.C5368b.m11709s(r0, r2)
            goto L31
        L46:
            android.os.Parcelable$Creator<c6.m> r3 = p036c6.C0897m.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.m r2 = (p036c6.C0897m) r2
            r34 = r2
            goto L31
        L51:
            android.os.Parcelable$Creator<c6.i> r3 = p036c6.C0889i.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.i r2 = (p036c6.C0889i) r2
            r33 = r2
            goto L31
        L5c:
            android.os.Parcelable$Creator<c6.t> r3 = p036c6.C0911t.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.t r2 = (p036c6.C0911t) r2
            r32 = r2
            goto L31
        L67:
            android.os.Parcelable$Creator<c6.c> r3 = p036c6.C0877c.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.c r2 = (p036c6.C0877c) r2
            r31 = r2
            goto L31
        L72:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r30 = r2
            goto L31
        L79:
            android.os.Parcelable$Creator<c6.n> r3 = p036c6.C0899n.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r0, r2, r3)
            r29 = r2
            goto L31
        L82:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r28 = r2
            goto L31
        L89:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r27 = r2
            goto L31
        L90:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r26 = r2
            goto L31
        L97:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r25 = r2
            goto L31
        L9e:
            long[] r2 = p270p6.C5368b.m11693c(r0, r2)
            r24 = r2
            goto L31
        La5:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r23 = r2
            goto L31
        Lac:
            double r2 = p270p6.C5368b.m11702l(r0, r2)
            r21 = r2
            goto L31
        Lb4:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r19 = r2
            goto L31
        Lbc:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r17 = r2
            goto L31
        Lc4:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r16 = r2
            goto L31
        Lcc:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r15 = r2
            goto L31
        Ld3:
            double r2 = p270p6.C5368b.m11702l(r0, r2)
            r13 = r2
            goto L31
        Lda:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r12 = r2
            goto L31
        Le1:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r10 = r2
            goto L31
        Le8:
            android.os.Parcelable$Creator<com.google.android.gms.cast.MediaInfo> r3 = com.google.android.gms.cast.MediaInfo.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            com.google.android.gms.cast.MediaInfo r2 = (com.google.android.gms.cast.MediaInfo) r2
            r9 = r2
            goto L31
        Lf3:
            p270p6.C5368b.m11699i(r0, r1)
            c6.p r0 = new c6.p
            r8 = r0
            r8.<init>(r9, r10, r12, r13, r15, r16, r17, r19, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0903p[] newArray(int r1) {
            r0 = this;
            c6.p[] r1 = new p036c6.C0903p[r1]
            return r1
    }
}
