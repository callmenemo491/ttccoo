package p113gc;

/* renamed from: gc.b */
/* loaded from: classes.dex */
public final class C2325b {

    /* renamed from: a */
    public static final java.lang.String[] f10564a = null;

    static {
            java.lang.String r0 = "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb \ufffc\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8"
            java.lang.String r1 = "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{\ufffc}~\u007f;<=>?[\\]^_ ,./:@!|\ufffc\ufff5\ufff6\ufffc\ufff0\ufff2\ufff3\ufff4\ufff7"
            java.lang.String r2 = "\u00c0\u00c1\u00c2\u00c3\u00c4\u00c5\u00c6\u00c7\u00c8\u00c9\u00ca\u00cb\u00cc\u00cd\u00ce\u00cf\u00d0\u00d1\u00d2\u00d3\u00d4\u00d5\u00d6\u00d7\u00d8\u00d9\u00da\ufffa\u001c\u001d\u001e\u00db\u00dc\u00dd\u00de\u00df\u00aa\u00ac\u00b1\u00b2\u00b3\u00b5\u00b9\u00ba\u00bc\u00bd\u00be\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8"
            java.lang.String r3 = "\u00e0\u00e1\u00e2\u00e3\u00e4\u00e5\u00e6\u00e7\u00e8\u00e9\u00ea\u00eb\u00ec\u00ed\u00ee\u00ef\u00f0\u00f1\u00f2\u00f3\u00f4\u00f5\u00f6\u00f7\u00f8\u00f9\u00fa\ufffa\u001c\u001d\u001e\ufffb\u00fb\u00fc\u00fd\u00fe\u00ff\u00a1\u00a8\u00ab\u00af\u00b0\u00b4\u00b7\u00b8\u00bb\u00bf\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8"
            java.lang.String r4 = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa\ufffc\ufffc\u001b\ufffb\u001c\u001d\u001e\u001f\u009f\u00a0\u00a2\u00a3\u00a4\u00a5\u00a6\u00a7\u00a9\u00ad\u00ae\u00b6\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"
            java.lang.String r5 = "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            p113gc.C2325b.f10564a = r0
            return
    }

    /* renamed from: a */
    public static int m6083a(byte[] r6, byte[] r7) {
            int r0 = r7.length
            if (r0 == 0) goto L27
            r0 = 0
            r1 = 0
            r2 = 0
        L6:
            int r3 = r7.length
            if (r1 >= r3) goto L26
            r3 = r7[r1]
            int r3 = r3 + (-1)
            int r4 = r3 / 6
            r4 = r6[r4]
            int r3 = r3 % 6
            int r3 = 5 - r3
            r5 = 1
            int r3 = r5 << r3
            r3 = r3 & r4
            if (r3 != 0) goto L1d
            r3 = 0
            goto L1e
        L1d:
            r3 = 1
        L1e:
            int r4 = r7.length
            int r4 = r4 - r1
            int r4 = r4 - r5
            int r3 = r3 << r4
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L6
        L26:
            return r2
        L27:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
    }

    /* renamed from: b */
    public static java.lang.String m6084b(byte[] r12, int r13, int r14) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = -1
            r3 = r13
            r4 = 0
            r5 = -1
            r6 = 0
        Lb:
            int r7 = r13 + r14
            r8 = 1
            if (r3 >= r7) goto L67
            java.lang.String[] r7 = p113gc.C2325b.f10564a
            r7 = r7[r4]
            r9 = r12[r3]
            char r7 = r7.charAt(r9)
            switch(r7) {
                case 65520: goto L58;
                case 65521: goto L58;
                case 65522: goto L58;
                case 65523: goto L58;
                case 65524: goto L58;
                case 65525: goto L54;
                case 65526: goto L52;
                case 65527: goto L4f;
                case 65528: goto L4d;
                case 65529: goto L50;
                case 65530: goto L1d;
                case 65531: goto L21;
                default: goto L1d;
            }
        L1d:
            r0.append(r7)
            goto L5f
        L21:
            int r3 = r3 + 1
            r7 = r12[r3]
            int r7 = r7 << 24
            int r3 = r3 + r8
            r9 = r12[r3]
            int r9 = r9 << 18
            int r7 = r7 + r9
            int r3 = r3 + r8
            r9 = r12[r3]
            int r9 = r9 << 12
            int r7 = r7 + r9
            int r3 = r3 + r8
            r9 = r12[r3]
            int r9 = r9 << 6
            int r7 = r7 + r9
            int r3 = r3 + r8
            r9 = r12[r3]
            int r7 = r7 + r9
            java.text.DecimalFormat r9 = new java.text.DecimalFormat
            java.lang.String r10 = "000000000"
            r9.<init>(r10)
            long r10 = (long) r7
            java.lang.String r7 = r9.format(r10)
            r0.append(r7)
            goto L5f
        L4d:
            r4 = 1
            goto L50
        L4f:
            r4 = 0
        L50:
            r5 = -1
            goto L5f
        L52:
            r5 = 3
            goto L55
        L54:
            r5 = 2
        L55:
            r6 = r4
            r4 = 0
            goto L5f
        L58:
            r5 = 65520(0xfff0, float:9.1813E-41)
            int r7 = r7 - r5
            r6 = r4
            r4 = r7
            r5 = 1
        L5f:
            int r7 = r5 + (-1)
            if (r5 != 0) goto L64
            r4 = r6
        L64:
            int r3 = r3 + r8
            r5 = r7
            goto Lb
        L67:
            int r12 = r0.length()
            if (r12 <= 0) goto L84
            int r12 = r0.length()
            int r12 = r12 - r8
            char r12 = r0.charAt(r12)
            r13 = 65532(0xfffc, float:9.183E-41)
            if (r12 != r13) goto L84
            int r12 = r0.length()
            int r12 = r12 - r8
            r0.setLength(r12)
            goto L67
        L84:
            java.lang.String r12 = r0.toString()
            return r12
    }
}
