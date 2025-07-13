package p124h7;

/* renamed from: h7.he */
/* loaded from: classes.dex */
public final class C2662he implements android.os.Parcelable.Creator<p124h7.C2644ge> {
    public C2662he() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p124h7.C2644ge createFromParcel(android.os.Parcel r23) {
            r22 = this;
            r0 = r23
            int r1 = p270p6.C5368b.m11710t(r23)
            r2 = 0
            r4 = 0
            r5 = 0
            r15 = r2
            r17 = r15
            r7 = r5
            r8 = r7
            r10 = r8
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r20 = r14
            r21 = r20
            r9 = 0
            r19 = 0
        L1b:
            int r2 = r23.dataPosition()
            if (r2 >= r1) goto L8c
            int r2 = r23.readInt()
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r2
            switch(r3) {
                case 2: goto L86;
                case 3: goto L80;
                case 4: goto L7a;
                case 5: goto L74;
                case 6: goto L6e;
                case 7: goto L64;
                case 8: goto L5e;
                case 9: goto L58;
                case 10: goto L52;
                case 11: goto L4b;
                case 12: goto L44;
                case 13: goto L39;
                case 14: goto L30;
                default: goto L2c;
            }
        L2c:
            p270p6.C5368b.m11709s(r0, r2)
            goto L1b
        L30:
            android.os.Parcelable$Creator<h7.oe> r3 = p124h7.C2788oe.CREATOR
            java.util.ArrayList r2 = p270p6.C5368b.m11698h(r0, r2, r3)
            r21 = r2
            goto L1b
        L39:
            android.os.Parcelable$Creator<v9.j0> r3 = p375v9.C6605j0.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            v9.j0 r2 = (p375v9.C6605j0) r2
            r20 = r2
            goto L1b
        L44:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r19 = r2
            goto L1b
        L4b:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r17 = r2
            goto L1b
        L52:
            long r2 = p270p6.C5368b.m11706p(r0, r2)
            r15 = r2
            goto L1b
        L58:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r14 = r2
            goto L1b
        L5e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r13 = r2
            goto L1b
        L64:
            android.os.Parcelable$Creator<h7.se> r3 = p124h7.C2860se.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r0, r2, r3)
            h7.se r2 = (p124h7.C2860se) r2
            r12 = r2
            goto L1b
        L6e:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r11 = r2
            goto L1b
        L74:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r10 = r2
            goto L1b
        L7a:
            boolean r2 = p270p6.C5368b.m11700j(r0, r2)
            r9 = r2
            goto L1b
        L80:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r8 = r2
            goto L1b
        L86:
            java.lang.String r2 = p270p6.C5368b.m11695e(r0, r2)
            r7 = r2
            goto L1b
        L8c:
            p270p6.C5368b.m11699i(r0, r1)
            h7.ge r0 = new h7.ge
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21)
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p124h7.C2644ge[] newArray(int r1) {
            r0 = this;
            h7.ge[] r1 = new p124h7.C2644ge[r1]
            return r1
    }
}
