package p036c6;

/* renamed from: c6.k0 */
/* loaded from: classes.dex */
public final class C0894k0 implements android.os.Parcelable.Creator<com.google.android.gms.cast.MediaInfo> {
    public C0894k0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.cast.MediaInfo createFromParcel(android.os.Parcel r27) {
            r26 = this;
            r0 = r27
            int r1 = p270p6.C5368b.m11710t(r27)
            r2 = 0
            r4 = 0
            r5 = 0
            r11 = r2
            r20 = r11
            r7 = r4
            r9 = r7
            r10 = r9
            r13 = r10
            r14 = r13
            r15 = r14
            r16 = r15
            r17 = r16
            r18 = r17
            r19 = r18
            r22 = r19
            r23 = r22
            r24 = r23
            r25 = r24
            r8 = 0
        L24:
            int r2 = r27.dataPosition()
            if (r2 >= r1) goto Lbe
            int r2 = r27.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto Lb7;
                case 3: goto Lb0;
                case 4: goto La9;
                case 5: goto L9e;
                case 6: goto L98;
                case 7: goto L90;
                case 8: goto L86;
                case 9: goto L80;
                case 10: goto L77;
                case 11: goto L6e;
                case 12: goto L67;
                case 13: goto L5c;
                case 14: goto L55;
                case 15: goto L4e;
                case 16: goto L47;
                case 17: goto L40;
                case 18: goto L39;
                default: goto L35;
            }
        L35:
            p270p6.C5368b.m11709s(r0, r2)
            goto L24
        L39:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r25 = r2
            goto L24
        L40:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r24 = r2
            goto L24
        L47:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r23 = r2
            goto L24
        L4e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r22 = r2
            goto L24
        L55:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r20 = r2
            goto L24
        L5c:
            android.os.Parcelable$Creator<c6.s> r3 = p036c6.C0909s.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.s r2 = (p036c6.C0909s) r2
            r19 = r2
            goto L24
        L67:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r18 = r2
            goto L24
        L6e:
            android.os.Parcelable$Creator<c6.a> r3 = p036c6.C0871a.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r0, r2, r3)
            r17 = r2
            goto L24
        L77:
            android.os.Parcelable$Creator<c6.b> r3 = p036c6.C0874b.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r0, r2, r3)
            r16 = r2
            goto L24
        L80:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r15 = r2
            goto L24
        L86:
            android.os.Parcelable$Creator<c6.r> r3 = p036c6.C0907r.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.r r2 = (p036c6.C0907r) r2
            r14 = r2
            goto L24
        L90:
            android.os.Parcelable$Creator<com.google.android.gms.cast.MediaTrack> r3 = com.google.android.gms.cast.MediaTrack.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r0, r2, r3)
            r13 = r2
            goto L24
        L98:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r11 = r2
            goto L24
        L9e:
            android.os.Parcelable$Creator<c6.k> r3 = p036c6.C0893k.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            c6.k r2 = (p036c6.C0893k) r2
            r10 = r2
            goto L24
        La9:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r9 = r2
            goto L24
        Lb0:
            int r2 = p270p6.C5368b.m11705o(r0, r2)
            r8 = r2
            goto L24
        Lb7:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L24
        Lbe:
            p270p6.C5368b.m11699i(r0, r1)
            com.google.android.gms.cast.MediaInfo r0 = new com.google.android.gms.cast.MediaInfo
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.cast.MediaInfo[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.cast.MediaInfo[] r1 = new com.google.android.gms.cast.MediaInfo[r1]
            return r1
    }
}
